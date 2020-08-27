package com.yc.C86S3PpkSpringBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@SpringBootApplication
@MapperScan("com.yc.C86S3PpkSpringBoot.dao")
//开启定时任务
@EnableScheduling
public class C86S3PpkSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(C86S3PpkSpringBootApplication.class, args);
	}
	
	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		return new ServerEndpointExporter();
	}
	
	
}
