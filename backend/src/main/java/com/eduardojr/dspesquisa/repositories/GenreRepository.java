package com.eduardojr.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
