package com.gavin.spt.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserAppliction {
    public static void main(String[] args) {
        SpringApplication.run(UserAppliction.class, args);
    }
}
