package produtos.src.db;

import java.util.ArrayList;
import java.util.List;

import produtos.src.models.Produto;

public class ProdutosDB {
    private List<Produto> produtoList = new ArrayList<>();

    public List<Produto> getProdutoList() {
        return this.produtoList;
    }

    public void setProdutoList(Produto produto) {
        produtoList.add(produto);
    }

}
