package com.micro.kiwi.cloud.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import com.micro.kiwi.cloud.hystrix.stream.MockStreamServlet;

/**
 * 断路器
 * 
 * @author xxq 2016.10.31
 */
@SuppressWarnings("deprecation")
@EnableHystrixDashboard
@SpringBootApplication
public class KiwiCloudHystrixApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KiwiCloudHystrixApplication.class).web(true);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(KiwiCloudHystrixApplication.class).web(true).run(args);
	}

	@Bean
	public ServletRegistrationBean mockStreamServlet() {
		return new ServletRegistrationBean(new MockStreamServlet(), "/mock.stream");
	}

}
