package com.ygor.dev.loja.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoDTO{
    String nome;
    String descricao;
    BigDecimal valor;
}
