package com.gavin.spt.user.controller;

import com.gavin.spt.common.api.CommonResult;
import com.gavin.spt.order.dto.rsp.OrderItems;
import com.gavin.spt.user.service.FeignOrderService;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserOrderController {
    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    FeignOrderService feignOrderService;

    @RequestMapping(value = "/createOrder")
    public List<String> createOrder() {
        List<ServiceInstance> instances = discoveryClient.getInstances("spt-order");
        return instances.stream().map(instanceInfo -> String.format("%s-%s-%s", instanceInfo.getScheme(), instanceInfo.getHost(), instanceInfo.getPort())).collect(Collectors.toList());
    }

    @RequestMapping(value = "/queryOrder")
    public CommonResult<OrderItems> queryOrder() {
        System.out.println("user query order");
        CommonResult<OrderItems> orderItemsCommonResult = feignOrderService.queryOrder(1);
        return orderItemsCommonResult;
    }
}
