package com.mmtech.distribution.config;

import com.mmtech.distribution.interceptor.LogHandlerInterceptor;
import com.mmtech.distribution.interceptor.WechatHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Adam DENG
 * @Date 2018/7/4 15:07
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WechatHandlerInterceptor());
        // registry.addInterceptor(new LogHandlerInterceptor());
    }

}
