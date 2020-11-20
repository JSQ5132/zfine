package com.ykxj.zfine.config.shiro;

import com.ykxj.zfine.common.utils.JWTUtils;
import com.ykxj.zfine.model.mysql.User;
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

    /**
     * 大坑！，必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = JWTUtils.getUsername(principals.toString());


        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.addRole(user.getRole());
//        Set<String> permission = new HashSet<>(Arrays.asList(user.getPermission().split(",")));

        simpleAuthorizationInfo.addStringPermission("/order/list");
        return simpleAuthorizationInfo;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtils.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token 无效！"); //token无效
        }
        User user = userService.getUserByAccount(username);
        if (user == null) {
            throw new AuthenticationException("用户不存在!");
        }
        if (! JWTUtils.verify(token, username, user.getPassword())) {
            throw new AuthenticationException("用户名或密码错误！");
        }
        return new SimpleAuthenticationInfo(token, token, this.getName());
    }

}
