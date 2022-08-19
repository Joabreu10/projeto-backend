package br.com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.dto.UsuarioCursoDTO;
import br.com.backend.modelo.Usuario;
import br.com.backend.modelo.UsuarioCurso;
import br.com.backend.service.UsuarioService;

@RequestMapping("/usuario")
@RestController
@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/salvar")
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){
		Usuario user = usuarioService.save(usuario); 
		return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Usuario>> listarUsuario (){
		return ResponseEntity.ok().body(usuarioService.listar());
	}
	
	@PostMapping("/curso-list-save")
	public void salvarCurso (@RequestBody UsuarioCursoDTO usuarioCurso){
		 usuarioService.save(usuarioCurso);
	}
	
	@GetMapping("/curso-list/{id}")
	public ResponseEntity<List<UsuarioCurso>> listarCursos(@PathVariable Long id) {
		return ResponseEntity.ok().body(usuarioService.listarCursos(id));
	}
}
