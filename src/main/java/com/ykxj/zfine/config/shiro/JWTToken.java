package com.ykxj.zfine.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author JiangShengQiang
 * @date 2020/11/19 15:00
 * @desc
 */
public class JWTToken implements AuthenticationToken {
    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
