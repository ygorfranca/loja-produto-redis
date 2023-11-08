package com.ygor.dev.loja.controller;

import com.ygor.dev.loja.domain.Produto;
import com.ygor.dev.loja.dto.ProdutoDTO;
import com.ygor.dev.loja.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping(value = "/produto")
    public List<Produto> salvar(@RequestBody ProdutoDTO produto){
        return produtoService.gravarProduto(produto);
    }
    @GetMapping(value = "/produto")
    public List<Produto> listar(){
        return produtoService.listarProdutos();
    }

    @GetMapping(value = "/produto/{id}")
    public Produto buscar(@PathVariable Long id){
        return produtoService.buscarProduto(id);
    }
}
