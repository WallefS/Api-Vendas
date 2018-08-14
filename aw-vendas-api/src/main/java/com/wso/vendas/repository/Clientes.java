package com.wso.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wso.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
