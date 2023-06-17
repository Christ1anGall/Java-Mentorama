package com.FilmesGall.films.entities;

public abstract class CaracteristicasFilm {
    private String nomeDoDiretor;
    private int ano;
    private int nota;

    public String getNomeDoDiretor() {
        return nomeDoDiretor;
    }

    public void setNomeDoDiretor(String nomeDoDiretor) {
        this.nomeDoDiretor = nomeDoDiretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}