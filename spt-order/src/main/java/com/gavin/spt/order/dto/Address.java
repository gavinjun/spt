package com.gavin.spt.order.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Address {
    @NotBlank(message = "街道不能为空")
    private String street;
}
