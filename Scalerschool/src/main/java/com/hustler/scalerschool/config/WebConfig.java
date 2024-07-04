package com.hustler.scalerschool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addViewCotrollers(ViewControllerRegistry registry){
         registry.addViewController("/courses").setViewName("courses");
     }
}
