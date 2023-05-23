package src.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import src.models.Estoque;

public class EstoqueDB {
    private static Map<String, Estoque> estoqueDBMap = new HashMap<>();

    public Map<String, Estoque> getEstoqueDBMap() {
        return estoqueDBMap;

    }

    public static List<Estoque> getProdutoList() {
        List<Estoque> estoques = new ArrayList<>();
        for (Map.Entry<String, Estoque> estoque : estoqueDBMap.entrySet()) {
            estoques.add(estoque.getValue());
        }

        return estoques;
    }

    public Estoque getEstoque(int idEstoque) {
        return estoqueDBMap.get(idEstoque);
    }

    public void addNovoEstoque(Estoque estoque) {

        estoqueDBMap.put(estoque.getId(), estoque);
    }

}
