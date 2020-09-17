package com.eduardojr.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardojr.dspesquisa.dto.RecordDTO;
import com.eduardojr.dspesquisa.dto.RecordInsertDTO;
import com.eduardojr.dspesquisa.entities.Game;
import com.eduardojr.dspesquisa.entities.Record;
import com.eduardojr.dspesquisa.repositories.GameRepository;
import com.eduardojr.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public RecordDTO insert(RecordInsertDTO dto) {

        Record entity = new Record();
        
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());
        
        Game game = gameRepository.getOne(dto.getGameId());
        entity.setGame(game);
        
        entity = repository.save(entity);
        return new RecordDTO(entity);
	}
}
