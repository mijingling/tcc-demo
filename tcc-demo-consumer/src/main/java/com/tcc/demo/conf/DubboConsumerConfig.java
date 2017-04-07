package com.tcc.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * dubbo配置文件
 */
@Component
public class DubboConsumerConfig {
	@Autowired
	DubboConsumerProperties dubboConsumerProperties;

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(dubboConsumerProperties.getAppName());
		return applicationConfig;
	}

	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol(dubboConsumerProperties.getProtocol());
		registryConfig.setAddress(dubboConsumerProperties.getAddress());
		return registryConfig;
	}

}
