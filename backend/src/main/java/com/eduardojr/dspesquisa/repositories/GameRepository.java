package com.eduardojr.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
