package com.rg.devopspucpr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void somar() {
        Long resultado = calculatorService.somar(10L, 5L);
        assertEquals(15L, resultado);
    }

    @Test
    void subtrair() {
        Long resultado = calculatorService.subtrair(10L, 5L);
        assertEquals(5L, resultado);
    }

    @Test
    void dividir() {
        Long resultado = calculatorService.dividir(10L, 2L);
        assertEquals(5L, resultado);
    }

    @Test
    void multiplicar() {
        Long resultado = calculatorService.multiplicar(10L, 5L);
        assertEquals(50L, resultado);
    }

    @Test
    void dividirPorZero_deveLancarArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.dividir(10L, 0L);
        });
    }
}
