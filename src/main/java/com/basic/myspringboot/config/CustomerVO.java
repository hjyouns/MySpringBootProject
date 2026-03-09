package com.basic.myspringboot.config;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class CustomerVO {
    private String mode;
    private double rate;
}
