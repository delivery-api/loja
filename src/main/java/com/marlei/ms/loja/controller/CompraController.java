package com.marlei.ms.loja.controller;

import com.marlei.ms.loja.dto.CompraDTO;
import com.marlei.ms.loja.entity.Compra;
import com.marlei.ms.loja.service.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/compras")
public class CompraController {

    private final CompraService compraService;

    /**
     * Recebe as requisições de compra do usuário
     * @param compra (Contém os produtos e o endereço de destino/entrega)
     * @return
     */
    @PostMapping
    public Compra realizarCompras(@RequestBody CompraDTO compra){
        return compraService.realizaCompra(compra);
    }
}
