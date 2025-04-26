package com.rg.devopspucpr;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public Long somar(Long a, Long b) {
        return a + b;
    }

    public Long subtrair(Long a, Long b) {
        return a - b;
    }

    public Long dividir(Long a, Long b) {
        return a / b;
    }

    public Long multiplicar(Long a, Long b) {
        return a * b;
    }
}
