package com.micro.kiwi.cloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 * 
 * @author xxq 2016.10.31
 */
@EnableEurekaServer
@SpringBootApplication
public class KiwiCloudDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiwiCloudDiscoveryApplication.class, args);
	}
}
