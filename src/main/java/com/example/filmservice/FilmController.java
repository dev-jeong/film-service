package com.example.filmservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.getAllFilms();
    }    

    @GetMapping("/{id}")
    public Film getFilmById(@PathVariable Integer id) {
        return filmService.getFilmById(id);
    }
}
