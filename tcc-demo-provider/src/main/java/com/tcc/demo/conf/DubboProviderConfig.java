package com.tcc.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * dubbo配置文件
 */
@Component
public class DubboProviderConfig {

	@Autowired
	DubboProviderProperties dubboProviderProperties;

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(dubboProviderProperties.getAppName());
		return applicationConfig;
	}

	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol(dubboProviderProperties.getProtocol());
		registryConfig.setAddress(dubboProviderProperties.getAddress());
		return registryConfig;
	}

	@Bean
	public ProtocolConfig rest() {
		ProtocolConfig pc = new ProtocolConfig();
		pc.setName("rest");
		pc.setPort(dubboProviderProperties.getRestPort());
		pc.setAccepts(5000);
		pc.setServer(dubboProviderProperties.getRestServer());
		pc.setContextpath(dubboProviderProperties.getContextPath());
		return pc;
	}

	@Bean
	public ProtocolConfig dubbo() {
		ProtocolConfig pc = new ProtocolConfig();
		pc.setName("dubbo");
		pc.setThreadpool("fixed");
		pc.setPort(dubboProviderProperties.getDubboPort());
		pc.setThreads(100);
		return pc;
	}
}
