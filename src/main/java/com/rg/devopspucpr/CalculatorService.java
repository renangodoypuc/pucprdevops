package com.rg.devopspucpr;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public Long somar(Long a, Long b) {
        return a + b;
    }

}
