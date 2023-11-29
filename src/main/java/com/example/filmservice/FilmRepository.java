package com.example.filmservice;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

}
