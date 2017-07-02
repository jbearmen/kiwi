package com.micro.kiwi.cloud.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * 应用监控中心
 * 
 * @author xxq 2016.10.31
 */
@SpringBootApplication
@EnableAdminServer
public class KiwiCloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(KiwiCloudAdminApplication.class, args);
	}
}
