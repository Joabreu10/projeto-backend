package br.com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.dto.UsuarioCursoDTO;
import br.com.backend.modelo.Curso;
import br.com.backend.modelo.Usuario;
import br.com.backend.modelo.UsuarioCurso;
import br.com.backend.repository.UsuarioCursoRepository;
import br.com.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioCursoRepository usuarioCursoRepository;
	
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public void save(UsuarioCursoDTO usuarioDTO) {
		for(Curso curso: usuarioDTO.getCursos()) {
			UsuarioCurso usuarioCurso = new UsuarioCurso();
			usuarioCurso.setCurso(curso);
			usuarioCurso.setUsuario(usuarioDTO.getUsuario());
			usuarioCursoRepository.save(usuarioCurso);
		}
	}
	
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}
	
	public List<UsuarioCurso> listarCursos(Long id){
		List<UsuarioCurso> curso = usuarioCursoRepository.findAllByUsuarioId(id);
		return curso;
	}
}
