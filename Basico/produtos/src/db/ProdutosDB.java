package src.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import src.models.Produto;

public class ProdutosDB {
    private Map<Integer, Produto> produtosMap = new HashMap<>();

    public List<Produto> getProdutoList() {
        List<Produto> produtos = new ArrayList<>();
        for (Map.Entry<Integer, Produto> produto : produtosMap.entrySet()) {
            produtos.add(produto.getValue());
        }

        return produtos;
    }

    public void setProdutoList(Produto produto) {
        produtosMap.put(produto.getId(), produto);
    }

    public Produto getProdutoId(Integer id) {
        return produtosMap.get(id);
    }
}
