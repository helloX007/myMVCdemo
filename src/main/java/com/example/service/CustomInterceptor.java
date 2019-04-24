package com.example.service;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IDEA
 * author : chengbaiming
 * Date : 2019/2/27 0027
 * Time : 下午 3:39
 */
public class CustomInterceptor implements HandlerInterceptor {
    /**
     *
     * 该方法会在controller方法前执行,当其返回值为true时，表示继续向下执行,否则中断后续的所有操作
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        System.out.println(" My Interceptor is preHandle. URL:"+httpServletRequest.getRequestURL());
        /**
         * 执行完下面的请求之后，会执行拦截到的请求，如果有多个拦截器，会执行下一个拦截器的pre方法
         */
        httpServletRequest.getRequestDispatcher("/home/index").forward(httpServletRequest,httpServletResponse);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("My Interceptor running postHandle.");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("My Interceptor is Completion.");
    }
}
