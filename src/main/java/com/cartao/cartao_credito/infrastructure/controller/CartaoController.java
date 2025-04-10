package com.cartao.cartao_credito.infrastructure.controller;

import com.cartao.cartao_credito.application.service.*;
import com.cartao.cartao_credito.domain.model.CartaoCredito;
import com.cartao.cartao_credito.domain.ports.out.*;
import org.springframework.web.bind.annotation.*;

import java.beans.JavaBean;
import java.util.List;

/**
 * Controlador REST para cartões de crédito.
 */
@JavaBean
@RestController
@RequestMapping("/api/cartoes")
public class CartaoController {

    private final CartaoService service;

    public CartaoController(CartaoRepositoryPort repositoryPort) {
        this.service = new CartaoService(repositoryPort);
    }

    @PostMapping
    public CartaoCredito criar(@RequestBody CartaoCredito cartao) {
        return service.criarCartao(cartao);
    }

    @GetMapping
    public List<CartaoCredito> listar() {
        return service.listarCartoes();
    }

    @GetMapping("/{id}")
    public CartaoCredito buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }
}
