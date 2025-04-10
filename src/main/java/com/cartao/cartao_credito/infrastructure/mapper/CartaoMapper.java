package com.cartao.cartao_credito.infrastructure.mapper;

import com.cartao.cartao_credito.domain.model.*;
import com.cartao.cartao_credito.infrastructure.persistence.entity.*;

public class CartaoMapper {

    public static CartaoEntity toEntity(CartaoCredito cartao) {
        return new CartaoEntity(
                cartao.getId(),
                cartao.getTitular(),
                cartao.getNumero(),
                cartao.getLimite(),
                cartao.getSaldo()
        );
    }

    public static CartaoCredito toDomain(CartaoEntity entity) {
        return new CartaoCredito(
                entity.getId(),
                entity.getTitular(),
                entity.getNumero(),
                entity.getLimite(),
                entity.getSaldo()
        );
    }
}