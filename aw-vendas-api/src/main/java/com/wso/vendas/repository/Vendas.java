package com.wso.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wso.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
