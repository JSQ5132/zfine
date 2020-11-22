package com.ykxj.zfine.config.shiro;

import com.ykxj.zfine.common.utils.JWTUtils;
import com.ykxj.zfine.model.mysql.Menu;
import com.ykxj.zfine.model.mysql.MenuButton;
import com.ykxj.zfine.model.mysql.Role;
import com.ykxj.zfine.model.mysql.User;
import com.ykxj.zfine.service.MenuButtonService;
import com.ykxj.zfine.service.RoleService;
import com.ykxj.zfine.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author JiangShengQiang
 * @date 2020/11/19 14:37
 * @desc
 */
@Component
public class JWTRealm extends AuthorizingRealm {

    private static final Logger LOGGER = LogManager.getLogger(JWTRealm.class);

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuButtonService menuButtonService;

    /**
     * 添加JWTToken支持，限定这个Realm只支持我们自定义的JWTToken,大坑！，必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     * 授权：说明下，这个方法的执行是在有shiro注解标签(如：@RequiresPermissions("sys:user:save"))的前提下才会调用，
     * 如果配有缓存，这个方法再调用一次后，授于的角色和权限将存在缓存，下次请求就不会进入这个方法；继续，在拿到权限后，
     * 进入控制器，校验注解权限是否合法，完成权限校验
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = JWTUtils.getUsername(principals.toString());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        User user = userService.getUserByAccount(username);
        //获取用户角色列表，目前是用户和角色一对一关系
        List<Role> roleList = roleService.listUserRoleByUserId(user.getId());
        for (Role role : roleList){
            //获取每个角色拥有的菜单列表
            List<Menu> menuList= roleService.listRoleMenuByRoleId(role.getId());
            for (Menu menu: menuList) {
                //获取每个菜单拥有的按钮列表
                List<MenuButton> menuButtonList = menuButtonService.listMenuButtonByMenuId(menu.getId());
                for (MenuButton button: menuButtonList) {
                    //设置按钮url权限
                    simpleAuthorizationInfo.addStringPermission(button.getUrlAddress());
                }
            }
        }
        //可以组装好权限后一次性添加，抽离for循环中addStringPermission();
//        simpleAuthorizationInfo.addObjectPermissions(new HashSet<>());

//        simpleAuthorizationInfo.addRole(user.getRole());


        simpleAuthorizationInfo.addStringPermission("/order/list");//测试设置固定权限
        return simpleAuthorizationInfo;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        String token = (String) authcToken.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtils.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token 无效！"); //token无效
        }
        User user = userService.getUserByAccount(username);
        if (user == null) {
            throw new AuthenticationException("用户不存在!");
        }
        // 校验token是否超时失效 & 或者账号密码是否错误
        if (! JWTUtils.verify(token, username, user.getPassword())) {
            throw new AuthenticationException("token 过期请重新登录!");
        }

        return new SimpleAuthenticationInfo(token, token, this.getName());
    }

}
