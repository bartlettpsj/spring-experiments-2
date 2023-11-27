package com.iqss.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class MyBean {
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public HelloWorld sessionScopedBean() {
        System.out.println("Getting HelloWorld Bean");
        return new HelloWorld("Initial Value");
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public HelloWorld sessionScopedBean2() {
        System.out.println("Getting HelloWorld Bean2");
        return new HelloWorld("Initial Value2");
    }

}
