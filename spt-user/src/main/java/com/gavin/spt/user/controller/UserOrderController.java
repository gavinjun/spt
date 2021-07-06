package com.gavin.spt.user.controller;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserOrderController {
    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/createOrder")
    public List<String> createOrder() {
        List<ServiceInstance> instances = discoveryClient.getInstances("spt-order");
        return instances.stream().map(instanceInfo -> String.format("%s-%s-%s", instanceInfo.getScheme(), instanceInfo.getHost(), instanceInfo.getPort())).collect(Collectors.toList());
    }
}
