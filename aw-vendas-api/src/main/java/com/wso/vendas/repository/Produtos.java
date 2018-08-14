package com.wso.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wso.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
