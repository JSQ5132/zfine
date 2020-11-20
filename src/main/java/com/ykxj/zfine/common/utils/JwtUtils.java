package com.ykxj.zfine.common.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author JSQ
 * @Date 2020/11/18 22:00
 * @Version 1.0
 */
public class JwtUtils {
    private final static String USERNAME = "username";

    /**
     * 生成token
     *
     * @param secret   密钥
     * @param username 用户名
     * @return token
     */
    public static String sign(String secret, String username) throws UnsupportedEncodingException {
        Date date = new Date(System.currentTimeMillis() + 1000);
        Algorithm algorithm = Algorithm.HMAC256(secret);
        String token = JWT.create()
                .withClaim(USERNAME, username)
                .withExpiresAt(date)
                .sign(algorithm);

        return token;
    }

    /**
     * 根据token获取用户名
     *
     * @param token 令牌
     * @return username
     */
    public static String getUsername(String token) {
        DecodedJWT decodedJWT = JWT.decode(token);
        String username = decodedJWT.getClaim(USERNAME).asString();

        return username;
    }

    /**
     * 校验token
     *
     * @param secret 密钥
     * @param username 用户名
     * @param token token
     * @return 是否合法
     */
    public static boolean verify(String secret, String username, String token) {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWT.require(algorithm)
                    .withClaim(USERNAME, username)
                    .build()
                    .verify(token);
            return true;

    }

}
