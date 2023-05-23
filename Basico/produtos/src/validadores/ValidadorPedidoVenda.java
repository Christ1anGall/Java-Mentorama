package src.validadores;

import java.util.ArrayList;
import java.util.List;

import src.models.PedidoVenda;

public class ValidadorPedidoVenda extends Validador {

    private PedidoVenda pedidoVenda;

    public List<IValidadorPedidoVenda> validadorPedidoVenda = new ArrayList<>();

    public ValidadorPedidoVenda(PedidoVenda pedidoVenda) {
        this.pedidoVenda = pedidoVenda;

        this.validadorPedidoVenda.add(new ValidadorDataValidade());
        this.validadorPedidoVenda.add(new ValidadorQuantidade());

    }

    @Override
    public boolean ehValidado() {
        for (IValidadorPedidoVenda validadorPedidoVenda : validadorPedidoVenda) {
            String error = validadorPedidoVenda.validar(pedidoVenda);

            if (error != null) {
                adicionarErro(error);
            }

        }

        return !(getErrors().size() > 0);
    }

}
