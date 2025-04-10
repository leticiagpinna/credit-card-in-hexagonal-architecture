package com.cartao.cartao_credito.infrastructure.persistence.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;


/**
 * Representa o cartão salvo no MongoDB.
 */
@Document(collection = "cartoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartaoEntity {
    @Id
    private String id;
    private String titular;
    private String numero;
    private Double limite;
    private Double saldo;
}
