package com.apiproduto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.apiproduto.api.models.ProdutoRepository;



@Controller("/")
public class ProdutoControler {
    @Autowired 
    private ProdutoRepository repository;

     @GetMapping("/listagem") // muda a url
    public String listarProdutos(){
        return "listar";
    }
    @GetMapping("/Cadastro") 
    public String cadastrarProdutos(){
        return "Cadastrar";
    }
    
}

