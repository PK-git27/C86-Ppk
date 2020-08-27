package com.yc.C86S3Ppkblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yc.C86S3Ppkblog.web.LoginInterceptor;

@SpringBootApplication
@MapperScan("com.yc.C86S3Ppkblog.dao")
public class C86S3PpkBlogApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(C86S3PpkBlogApplication.class, args);
	}

	/**
	 * 拦截器注册方法
	 * 参数：拦截器注册器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		
		InterceptorRegistration ir = registry.addInterceptor(new LoginInterceptor());
		//互联网项目 => 拦截少数资源
		//企业内部管理项目 => 拦截大多数资源
		ir.addPathPatterns("/toAddArticle",
				"addAcrticle.do",
				"/comment");
		
		
	}
	
	

}
