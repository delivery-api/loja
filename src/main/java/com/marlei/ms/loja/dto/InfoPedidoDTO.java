package com.marlei.ms.loja.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoPedidoDTO {
    private Long id;
    private Integer tempoDePreparo;
    private String enderecoDestino;
}
