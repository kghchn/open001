package com.hubery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @program hubery
 * @description: App
 * @author: kgh
 * @create: 2019/07/08 21:21
 */

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableCaching
@SpringBootApplication
public class HuberyApplication {
    public static void main(String[] args) {
        SpringApplication.run(HuberyApplication.class, args);
    }
}
