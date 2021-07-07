package com.gavin.spt.order.controller;

import com.gavin.spt.common.api.CommonResult;
import com.gavin.spt.order.dto.rsp.OrderItem;
import com.gavin.spt.order.dto.rsp.OrderItems;
import com.gavin.spt.order.facede.QueryOrderService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class FeignOrderController implements QueryOrderService {
    @Value("${server.port}")
    String port;
    @Override
    @RequestMapping(value = "/queryOrder", method = RequestMethod.GET)
    public CommonResult<OrderItems> queryOrder(Integer orderId) {
        log.info("query order, port:{}", port);
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        OrderItems orderItems = new OrderItems();
        OrderItem orderItem = new OrderItem();
        orderItem.setUserId(1);
        orderItem.setOrderNo("20210707114030sn1");
        orderItem.setPayTime(new Date());
        orderItems.setOrderItemList(Lists.newArrayList(orderItem));
        return CommonResult.success(orderItems);
    }
}
