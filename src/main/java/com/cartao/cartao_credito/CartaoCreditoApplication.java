package com.cartao.cartao_credito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cartao.cartao_credito")
public class CartaoCreditoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CartaoCreditoApplication.class, args);
    }
}
