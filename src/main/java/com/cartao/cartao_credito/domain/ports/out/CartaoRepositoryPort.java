package com.cartao.cartao_credito.domain.ports.out;

import com.cartao.cartao_credito.domain.model.*;

import java.beans.JavaBean;
import java.util.List;
import java.util.Optional;
@JavaBean
public interface CartaoRepositoryPort {
    CartaoCredito salvar(CartaoCredito cartao);
    List<CartaoCredito> buscarTodos();
    Optional<CartaoCredito> buscarPorId(String id);
}