package com.FilmesGall.films.entities;

public class Film extends CaracteristicasFilm {
    private Integer id;
    private String nome;

    public Film(Integer id, String nome, String nomeDoDiretor, Integer ano, Integer nota) {
        super();
        this.id = id;
        this.nome = nome;
        this.setNomeDoDiretor(nomeDoDiretor);
        this.setAno(ano);
        this.setNota(nota);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}