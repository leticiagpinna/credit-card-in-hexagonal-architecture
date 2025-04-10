package com.cartao.cartao_credito.infrastructure.persistence.adapter;

import com.cartao.cartao_credito.domain.model.*;
import com.cartao.cartao_credito.domain.ports.out.*;
import com.cartao.cartao_credito.infrastructure.mapper.*;
import com.cartao.cartao_credito.infrastructure.repository.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
@Repository
public class CartaoRepositoryAdapter implements CartaoRepositoryPort {

    private final CartaoRepository repository;

    public CartaoRepositoryAdapter(CartaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CartaoCredito salvar(CartaoCredito cartao) {
        return CartaoMapper.toDomain(repository.save(CartaoMapper.toEntity(cartao)));
    }

    @Override
    public List<CartaoCredito> buscarTodos() {
        return repository.findAll().stream().map(CartaoMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<CartaoCredito> buscarPorId(String id) {
        return repository.findById(id).map(CartaoMapper::toDomain);
    }
}