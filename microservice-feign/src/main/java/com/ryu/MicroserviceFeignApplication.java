package com.ryu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 需要在此处使用@EnableFeignClients打开Feign功能
 */

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MicroserviceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceFeignApplication.class, args);
    }
}
