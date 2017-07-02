
package com.micro.kiwi.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@SpringBootApplication
@EnableZipkinStreamServer
public class KiwiCloudZipkinApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(KiwiCloudZipkinApplication.class, args);
	}

}