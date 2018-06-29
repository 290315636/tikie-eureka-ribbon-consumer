/**
 * 
 * 项目名称：tikie-eureka-ribbon
 * 创建日期：2018年6月28日
 * 修改历史：
 * 		1、[2018年6月28日]创建文件 by zhaocs
 */
package com.tikie.eureka.ribbon.service;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaocs
 * 提供负载均衡策略
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced // 轮询机制
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
