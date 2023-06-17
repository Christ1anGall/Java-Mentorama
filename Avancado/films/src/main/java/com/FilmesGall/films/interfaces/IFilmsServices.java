package com.FilmesGall.films.interfaces;

import java.util.List;

import com.FilmesGall.films.entities.Film;

public interface IFilmsServices {
    List<Film> findAll(String nome);

    Film findById(Integer id);

    Integer add(Film filme);

    void update(Film filme);

    void delete(Integer id);
}