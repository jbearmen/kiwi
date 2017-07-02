package com.micro.kiwi.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务网关
 * 
 * @author xxq 2016.10.31
 */
@EnableZuulProxy
@SpringBootApplication
public class KiwiCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiwiCloudGatewayApplication.class, args);
	}
}
