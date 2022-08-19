package br.com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.backend.modelo.Curso;
import br.com.backend.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Curso> findAll(){
		return cursoRepository.findAll();
	}	
	
	public Curso save(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
	}
}
