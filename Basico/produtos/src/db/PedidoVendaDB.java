package src.db;

import java.util.ArrayList;
import java.util.List;

import src.models.PedidoVenda;

public class PedidoVendaDB {
    private static List<PedidoVenda> pedidoVendas = new ArrayList<>();

    public static List<PedidoVenda> getPedidoVendas() {
        return pedidoVendas;
    }

    public void addPedidoVendas(PedidoVenda novoPedido) {
        Integer id = pedidoVendas.size() + 1;
        novoPedido.setId(id);

        pedidoVendas.add(novoPedido);
    }

}
