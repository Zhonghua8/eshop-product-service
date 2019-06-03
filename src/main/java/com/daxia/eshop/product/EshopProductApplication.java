package com.daxia.eshop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/1 23:26
 * @Version 1.0
 */

@EnableEurekaClient
@SpringBootApplication
public class EshopProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopProductApplication.class,args);
    }
}
