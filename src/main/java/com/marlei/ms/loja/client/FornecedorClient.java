package com.marlei.ms.loja.client;

import com.marlei.ms.loja.dto.InfoFornecedorDTO;
import com.marlei.ms.loja.dto.InfoPedidoDTO;
import com.marlei.ms.loja.dto.ItemDaCompra;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("fornecedor")
public interface FornecedorClient {

    @RequestMapping("/infos/{estado}")
    InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

    @RequestMapping(method = RequestMethod.POST, value = "/pedidos")
    InfoPedidoDTO realizaPedido(List<ItemDaCompra> itens);
}
