package com.tcc.demo.conf;

/**
 * DubboConsumer配置
 */
public class DubboConsumerProperties {

	private String appName;
	/**
	 * 注册中心的地址
	 */
	private String address;
	/**
	 * 所使用的协议
	 */
	private String protocol;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
}
