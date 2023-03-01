package com.marlei.ms.loja.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnderecoDTO {
    private String rua;
    private int numero;
    private String estado;

    @Override
    public String toString() {
        return "EnderecoDTO{" + "rua='" + rua + ", numero=" + numero + ", estado='" + estado + '}';
    }
}
