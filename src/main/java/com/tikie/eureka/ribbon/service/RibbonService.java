/**
 * 
 * 项目名称：tikie-eureka-ribbon
 * 创建日期：2018年6月28日
 * 修改历史：
 * 		1、[2018年6月28日]创建文件 by zhaocs
 */
package com.tikie.eureka.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author zhaocs
 * 消费者-调用提供者的服务
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    
    // 断路器注解，提供者的服务不通时提供熔断机制
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){
        return restTemplate.getForObject("http://eureka-provider/hi?name="+name,String.class);
    }
    
    // 断路器的具体逻辑
    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
