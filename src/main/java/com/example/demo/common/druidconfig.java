package com.example.demo.common;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import javax.servlet.Filter;

import org.springframework.boot.web.servlet.*;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class druidconfig {
    private static final String DB_PREFIX = "spring.datasource";

    @org.springframework.context.annotation.Bean
    public ServletRegistrationBean druidServlet() {
        System.out.println("init Druid Servlet Configuration ");
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean((javax.servlet.Servlet)new StatViewServlet(), new String[] { "/dao/*" });
        servletRegistrationBean.addInitParameter("allow", "");
        servletRegistrationBean.addInitParameter("deny", "");
        servletRegistrationBean.addInitParameter("loginUsername", "");
        servletRegistrationBean.addInitParameter("loginPassword", "");
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }

    @org.springframework.context.annotation.Bean
    public org.springframework.boot.web.servlet.FilterRegistrationBean filterRegistrationBean() {
        org.springframework.boot.web.servlet.FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean((Filter)new WebStatFilter(), new ServletRegistrationBean[0]);
        filterRegistrationBean.addUrlPatterns(new String[] { "/*" });
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
