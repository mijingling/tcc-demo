package com.tcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "classpath:application.properties" })
@ImportResource("classpath:applicationContext.xml")
public class ApplicationBootstrapConsumer {

	/**
	 * 启动入口
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationBootstrapConsumer.class, args);
	}

}
