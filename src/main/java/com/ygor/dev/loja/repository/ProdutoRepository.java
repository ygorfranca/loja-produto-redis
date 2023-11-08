package com.ygor.dev.loja.repository;

import com.ygor.dev.loja.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {



}
