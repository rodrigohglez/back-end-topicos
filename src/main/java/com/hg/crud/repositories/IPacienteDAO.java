package com.hg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.crud.models.PacienteDTO;

@Repository
public interface IPacienteDAO extends MongoRepository<PacienteDTO, String> {
	
	
}
