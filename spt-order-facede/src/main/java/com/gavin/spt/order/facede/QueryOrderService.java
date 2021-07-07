package com.gavin.spt.order.facede;

import com.gavin.spt.common.api.CommonResult;
import com.gavin.spt.order.dto.rsp.OrderItems;

public interface QueryOrderService {
    CommonResult<OrderItems> queryOrder(Integer orderId);
}
