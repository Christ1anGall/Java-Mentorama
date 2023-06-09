package com.FilmesGall.films.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FilmesGall.films.entities.Film;
import com.FilmesGall.films.interfaces.IFilmsServices;

@RestController
@RequestMapping("/films")
public class FilmsController {

    private final IFilmsServices filmsServices;

    @Autowired
    public FilmsController(IFilmsServices filmsServices) {
        this.filmsServices = filmsServices;
    }

    @GetMapping
    public List<Film> getAllFilms(@RequestParam(required = false) String nome) {
        if (nome != null) {
            return filmsServices.findAll(nome);
        } else {
            return filmsServices.findAll(null);
        }
    }

    @GetMapping("/{id}")
    public Film getFilmById(@PathVariable Integer id) {
        return filmsServices.findById(id);
    }

    @PostMapping
    public ResponseEntity addFilm(@RequestBody Film film) {
        try {
            Integer id = filmsServices.add(film);
            return new ResponseEntity<>(id, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity updateFilm(@PathVariable Integer id, @RequestBody Film film) {
        try {
            film.setId(id);
            filmsServices.update(film);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteFilm(@PathVariable Integer id) {
        filmsServices.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}