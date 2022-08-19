package br.com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.backend.modelo.Curso;
import br.com.backend.service.CursoService;

@RequestMapping("/cursos")
@Controller
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Curso>> listaCursos(){	
		return ResponseEntity.ok().body(cursoService.findAll());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Curso> cadastrar(@RequestBody Curso curso){
		Curso cursoSalvar = cursoService.save(curso); 
		return new ResponseEntity<Curso>(cursoSalvar, HttpStatus.CREATED);
	}
}
