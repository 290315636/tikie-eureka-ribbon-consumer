package com.tikie.eureka.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix              // 支持断路器
@EnableHystrixDashboard     // 支持断路器面板
@EnableEurekaClient
@SpringBootApplication
public class TikieEurekaRibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(TikieEurekaRibbonApplication.class, args);
	}
}
