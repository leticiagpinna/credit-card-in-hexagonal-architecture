package com.cartao.cartao_credito.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidade de domínio para Cartão de Crédito.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartaoCredito {
    private String id;
    private String titular;
    private String numero;
    private Double limite;
    private Double saldo;
}
