package com.gavin.spt.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class UserOrderService {
    @HystrixCommand
    public void orderService() {

    }
}
