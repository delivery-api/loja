package com.marlei.ms.loja.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class CompraDTO {
    private List<ItemDaCompra> itens;
    private EnderecoDTO endereco;
}
