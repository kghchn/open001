package com.hubery.utils.logininterceptor;

import com.hubery.entity.User;
import com.hubery.utils.GlobalConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program hubery
 * @description: 登录拦截器
 * @author: kgh
 * @create: 2019/05/23 19:06
 */

public class LoginInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute(GlobalConst.USER_SESSION_KEY);
        logger.info(request.getRequestURI());
        /**
         if (user == null || user.equals(""))  {
         response.sendRedirect("/login");
         logger.info("请先登录");
         return false;
         }
         */
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("afterCompletion...");
    }
}

