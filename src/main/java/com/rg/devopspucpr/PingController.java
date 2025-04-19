package com.rg.devopspucpr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/somar")
    public Long somar(@RequestParam Long a, @RequestParam Long b) {
        return calculatorService.somar(a, b);
    }

    @GetMapping("/subtrair")
    public Long subtrair(@RequestParam Long a, @RequestParam Long b) {
        return calculatorService.subtrair(a, b);
    }

    @GetMapping("/dividir")
    public Long dividir(@RequestParam Long a, @RequestParam Long b) {
        return calculatorService.dividir(a, b);
    }

}