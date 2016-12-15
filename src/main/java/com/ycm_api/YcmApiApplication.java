package com.ycm_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ycm_api.core.interceptor.ApiRequestInterceptor;

@SpringBootApplication
public class YcmApiApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(YcmApiApplication.class, args);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) 
	{
		super.addInterceptors(registry);
		registry.addInterceptor(new ApiRequestInterceptor()).addPathPatterns("/*")
															.excludePathPatterns("/login");
	}
}
