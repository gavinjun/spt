package com.gavin.spt.order.dto.req;

import com.gavin.spt.order.dto.Address;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class CreateOrderReq {
    @Valid
    @NotEmpty
    private List<Address> addresses;
    @NotNull
    private Integer userId;
}
