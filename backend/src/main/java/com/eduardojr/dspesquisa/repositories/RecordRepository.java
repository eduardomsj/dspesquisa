package com.eduardojr.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojr.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
