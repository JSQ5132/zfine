package com.ykxj.zfine.common.exception;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JiangShengQiang
 * @date 2020/11/18 18:43
 * @desc
 */
@ControllerAdvice
public class NoPermissionException {
    @ResponseBody
    @ExceptionHandler(UnauthorizedException.class)
    public Map<String, Object> handleShiroException(Exception ex) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 403);
        result.put("msg", "您没有权限访问该资源！");
        return result;
    }
    @ResponseBody
    @ExceptionHandler(AuthorizationException.class)
    public Map<String, Object> AuthorizationException(Exception ex) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 403);
        result.put("msg", "权限认证失败！");
        return result;
    }
    @ResponseBody
    @ExceptionHandler(IllegalStateException.class)
    public Map<String, Object> IllegalStateException(Exception ex) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 403);
        result.put("msg", "权限认证失败或token过期！");
        return result;

    }
}
