package com.gavin.spt.order;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class B extends A{
    private String name;
}
