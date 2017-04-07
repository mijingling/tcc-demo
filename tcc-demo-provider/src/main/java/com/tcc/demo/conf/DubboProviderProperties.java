package com.tcc.demo.conf;

/**
 * DubboProvider配置
 */
public class DubboProviderProperties {

	private String appName;
	/**
	 * 注册中心的地址
	 */
	private String address;
	/**
	 * 所使用的协议
	 */
	private String protocol;
	/**
	 * rest协议的端口
	 */
	private int restPort;
	/**
	 * rest协议的服务
	 */
	private String restServer;
	/**
	 * 上下文路径 默认为根目录
	 */
	private String contextPath = "";
	/**
	 * dubbo协议的端口号 默认20880
	 */
	private int dubboPort = 20880;

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

	public int getRestPort() {
		return restPort;
	}

	public void setRestPort(int restPort) {
		this.restPort = restPort;
	}

	public String getRestServer() {
		return restServer;
	}

	public void setRestServer(String restServer) {
		this.restServer = restServer;
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public int getDubboPort() {
		return dubboPort;
	}

	public void setDubboPort(int dubboPort) {
		this.dubboPort = dubboPort;
	}
}
