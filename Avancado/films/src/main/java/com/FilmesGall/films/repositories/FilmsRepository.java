package com.FilmesGall.films.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.FilmesGall.films.entities.Film;

@Repository
public class FilmsRepository {
    private final Map<Integer, Film> films;
    private final Map<String, Integer> nomeAnoDiretorMap;

    public FilmsRepository() {
        this.films = new HashMap<>();
        this.nomeAnoDiretorMap = new HashMap<>();
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
        validaFilm(film);

        Integer id = generateId();
        film.setId(id);
        films.put(id, film);

        String key = generateNomeAnoDiretorKey(film);
        nomeAnoDiretorMap.put(key, id);

        return id;
    }

    public void update(Film film) {
        Integer id = film.getId();
        if (films.containsKey(id)) {
            validaFilm(film);

            String key = generateNomeAnoDiretorKey(film);
            nomeAnoDiretorMap.put(key, id);

            films.put(id, film);
        } else {
            throw new RuntimeException("Filme não encontrado.");
        }
    }

    public void delete(Integer id) {
        Film film = films.remove(id);
        if (film != null) {
            String key = generateNomeAnoDiretorKey(film);
            nomeAnoDiretorMap.remove(key);
        }
    }

    private void validaFilm(Film film) {
        if (film.getNota() < 1 || film.getNota() > 5) {
            throw new RuntimeException("A nota do filme deve ser um inteiro entre 1 e 5.");
        }

        String key = generateNomeAnoDiretorKey(film);

        Integer existingFilmId = nomeAnoDiretorMap.get(key);

        if (existingFilmId != null) {
            throw new RuntimeException("Já existe um filme com o mesmo conjunto de nome, ano e diretor.");
        }
    }

    private Integer generateId() {
        return films.size() + 1;
    }

    private String generateNomeAnoDiretorKey(Film film) {
        return film.getNome() + "-" + film.getAno() + "-" + film.getNomeDoDiretor();
    }
}