package com.wso.vendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wso.vendas.model.Produto;
import com.wso.vendas.repository.Produtos;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResources {
	
	@Autowired
	private Produtos produtos;
	
	//listando os produtos
	@GetMapping
	public List<Produto> listar(){
		return produtos.findAll();
	}

}
