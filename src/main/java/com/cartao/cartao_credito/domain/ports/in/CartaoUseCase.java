package com.cartao.cartao_credito.domain.ports.in;


import com.cartao.cartao_credito.domain.model.*;

import java.util.List;

public interface CartaoUseCase {
    CartaoCredito criarCartao(CartaoCredito cartao);
    List<CartaoCredito> listarCartoes();
    CartaoCredito buscarPorId(String id);
}
