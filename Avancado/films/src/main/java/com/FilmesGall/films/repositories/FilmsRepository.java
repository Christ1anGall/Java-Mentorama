package com.FilmesGall.films.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.FilmesGall.films.entities.Film;

public class FilmsRepository {
    private Map<Integer, Film> films;

    public FilmsRepository() {
        films = new HashMap<>();
    }

    public List<Film> findAll() {
        return new ArrayList<>(films.values());
    }

    public List<Film> findAllByNome(String nome) {
        List<Film> filmsEncontrados = new ArrayList<>();
        for (Film film : films.values()) {
            if (film.getNome().equalsIgnoreCase(nome)) {
                filmsEncontrados.add(film);
            }
        }
        return filmsEncontrados;
    }

    public Film findById(Integer id) {
        return films.get(id);
    }

    public Integer add(Film film) {
        Integer id = generateId();
        film.setId(id);
        films.put(id, film);
        return id;
    }

    public void update(Film film) {
        Integer id = film.getId();
        if (films.containsKey(id)) {
            films.put(id, film);
        } else {
            throw new IllegalArgumentException("não encontrado");
        }
    }

    public void delete(Integer id) {
        films.remove(id);
    }

    private Integer generateId() {

        return films.size() + 1;
    }
}