package com.marlei.ms.loja.service;

import com.marlei.ms.loja.client.FornecedorClient;
import com.marlei.ms.loja.dto.CompraDTO;
import com.marlei.ms.loja.dto.InfoFornecedorDTO;
import com.marlei.ms.loja.dto.InfoPedidoDTO;
import com.marlei.ms.loja.entity.Compra;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompraService {

    private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);

    private final FornecedorClient client;

    public Compra realizaCompra(CompraDTO compra) {

        final String estado = compra.getEndereco().getEstado();

        LOG.info("buscando informações do fornecedor de {}", estado);
        InfoFornecedorDTO info = client.getInfoPorEstado(estado);

        LOG.info("realizando um pedido");
        InfoPedidoDTO pedido = client.realizaPedido(compra.getItens());

        Compra novaCompra = new Compra();
        novaCompra.setPedidoId(pedido.getId());
        novaCompra.setTempoDePreparo(pedido.getTempoDePreparo());
        novaCompra.setEnderecoDestino(compra.getEndereco().toString());

        return novaCompra;
    }
}
