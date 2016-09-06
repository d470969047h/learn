package com.daihui.framework.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by daihui on 2014-12-22.
 */
public class CheckLoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        return true;
/*        //取session对象
        HttpSession session = request.getSession();
        if (null != session && session.getAttribute("loginStatus") != null) {//放行
            return true;
        }

        //获取请求的uri来判断哪些请求可以放行
        String uri = request.getRequestURI();
        if (uri.endsWith("/index/index")
                || (uri.endsWith("/login/test"))
                || (uri.endsWith("/login/login"))
                || (uri.endsWith("/reg/validCode"))
                || (uri.startsWith("/css")) || (uri.startsWith("/js"))
                || (uri.startsWith("/images")) || (uri.startsWith("/common"))) {
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/login/login");
        return false;*/
    }
}
