package com.dongduong.spring.security.oauth2.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.dongduong.spring.biz.controller" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {
    //
}
