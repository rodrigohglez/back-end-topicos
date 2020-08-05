package com.hg.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hg.crud.models.PacienteDTO;
import com.hg.crud.repositories.IPacienteDAO;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteDAO repository;

	@PostMapping("/paciente")
	public PacienteDTO create(@Validated @RequestBody PacienteDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<PacienteDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/paciente/{id}")
	public PacienteDTO update(@PathVariable String id, @Validated @RequestBody PacienteDTO p) {
		return repository.save(p);
	}

	@DeleteMapping("/paciente/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}
