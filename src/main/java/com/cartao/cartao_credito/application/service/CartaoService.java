package com.cartao.cartao_credito.application.service;

import com.cartao.cartao_credito.domain.model.*;
import com.cartao.cartao_credito.domain.ports.in.*;
import com.cartao.cartao_credito.domain.ports.out.*;

import java.util.List;

public class CartaoService implements CartaoUseCase {

    private final CartaoRepositoryPort repository;

    public CartaoService(CartaoRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public CartaoCredito criarCartao(CartaoCredito cartao) {
        return repository.salvar(cartao);
    }

    @Override
    public List<CartaoCredito> listarCartoes() {
        return repository.buscarTodos();
    }

    @Override
    public CartaoCredito buscarPorId(String id) {
        return repository.buscarPorId(id).orElse(null);
    }
}