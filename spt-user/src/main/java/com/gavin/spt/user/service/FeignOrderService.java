package com.gavin.spt.user.service;

import com.gavin.spt.common.api.CommonResult;
import com.gavin.spt.order.dto.rsp.OrderItems;
import com.gavin.spt.order.facede.QueryOrderService;
import com.gavin.spt.user.config.FeignMDefaultConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spt-order", configuration = FeignMDefaultConfig.class)
public interface FeignOrderService extends QueryOrderService {
    @Override
    @RequestMapping(method = RequestMethod.GET,value = "/queryOrder")
    CommonResult<OrderItems> queryOrder(@RequestParam("order_id") Integer orderId);
}
