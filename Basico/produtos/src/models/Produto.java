package src.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private Date davaValidade;

    public Produto(int id, String descricao, double preco, Date dataValidade) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.davaValidade = dataValidade;
    }

    public int getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getDate() {
        SimpleDateFormat validade = new SimpleDateFormat("dd/MM/yyyy");

        return validade.format(davaValidade);
    }

}
