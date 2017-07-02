package com.micro.kiwi.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 服务配置中心
 * 
 * @author xxq 2016.10.31
 */
@EnableConfigServer
@SpringBootApplication
public class KiwiCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiwiCloudConfigApplication.class, args);
	}
}
