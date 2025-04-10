package com.cartao.cartao_credito.infrastructure.repository;

import com.cartao.cartao_credito.infrastructure.persistence.entity.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartaoRepository extends MongoRepository<CartaoEntity, String> {
}