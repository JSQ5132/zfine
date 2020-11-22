package com.ykxj.zfine.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author JiangShengQiang
 * @date 2020/11/19 15:00
 * @desc AuthenticationToken接口的实现默认是UsernamePasswordToken(这个是在前后端不分离的情况下使用)，
 * 而getPrincipal()方法返回的是帐号,getCredentials()返回的是密码，咱这类比下，getPrincipal()和getCredentials()咱
 * 们全部用token代替，有了这个咱们就能取到帐号了，这2个方法会在我们自定义的realm中用得到.
 */
public class JWTToken implements AuthenticationToken {
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    /**
     * 获取账号
     * @return 账号
     */
    @Override
    public Object getPrincipal() {
        return token;
    }

    /**
     * 获取密码
     * @return 密码
     */
    @Override
    public Object getCredentials() {
        return token;
    }
}
