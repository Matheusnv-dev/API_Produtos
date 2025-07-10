package com.apiproduto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.apiproduto.api.models.Produto;
import com.apiproduto.api.models.ProdutoRepository;



@Controller("/")
public class ProdutoControler {
    @Autowired 
    private ProdutoRepository repository;

     @GetMapping("/listagem") // muda a url
    public String listarProdutos(Model model){
     model.addAttribute("todosOsProdutos", repository.findAll());
        return "listar";
    }
    @GetMapping("/Cadastro") 
    public String mostrarProdutos(Model model){
        model.addAttribute("produto", new Produto());
        return "Cadastrar";
    }
    @PostMapping("/Cadastro")

    public String cadastrarProdutos(Produto produto){
       repository.save(produto);

    return "cadastrar";
}
}

