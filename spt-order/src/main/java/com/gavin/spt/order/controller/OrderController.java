package com.gavin.spt.order.controller;

import com.gavin.spt.common.api.CommonResult;
import com.gavin.spt.order.dto.req.CreateOrderReq;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @RequestMapping(value = "/createOrder")
    public CommonResult createOrder(@RequestBody @Validated CreateOrderReq createOrderReq) {
        return CommonResult.success(null);
    }
}
