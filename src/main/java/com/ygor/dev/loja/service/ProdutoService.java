package com.ygor.dev.loja.service;

import com.ygor.dev.loja.domain.Produto;
import com.ygor.dev.loja.dto.ProdutoDTO;
import com.ygor.dev.loja.repository.ProdutoRepository;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }


    public Produto buscarProduto(Long id){
        System.out.println("Buscando Produto");
        return  repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Codigo não encontrado"));
    }

    public List<Produto> gravarProduto(ProdutoDTO produtoDTO) throws RuntimeException{

        try {
            Produto produto = new Produto();
            PropertyUtils.copyProperties(produto,produtoDTO);
            repository.save(produto);
            return listarProdutos();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listarProdutos(){
        return repository.findAll();
    }

}
