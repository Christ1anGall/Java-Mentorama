package com.FilmesGall.films.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FilmesGall.films.entities.Film;
import com.FilmesGall.films.interfaces.IFilmsServices;
import com.FilmesGall.films.repositories.FilmsRepository;

@Service
public class FilmsService implements IFilmsServices {

    @Autowired
    private FilmsRepository filmsRepository;

    @Override
    public List<Film> findAll(String nome) {
        if (nome != null) {
            return filmsRepository.findAllByNome(nome);
        } else {
            return filmsRepository.findAll();
        }
    }

    @Override
    public Film findById(Integer id) {
        return filmsRepository.findById(id);
    }

    @Override
    public Integer add(Film film) {
        return filmsRepository.add(film);
    }

    @Override
    public void update(Film film) {
        filmsRepository.update(film);
    }

    @Override
    public void delete(Integer id) {
        filmsRepository.delete(id);
    }
}
