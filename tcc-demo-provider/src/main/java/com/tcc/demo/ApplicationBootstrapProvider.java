package com.tcc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "classpath:application.properties" })
@ImportResource({"classpath:applicationContext.xml","classpath:tcc-transaction.xml"})
public class ApplicationBootstrapProvider {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBootstrapProvider.class, args);
	}

}
