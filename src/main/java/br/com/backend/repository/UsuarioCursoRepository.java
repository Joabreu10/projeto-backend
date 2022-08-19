package br.com.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.modelo.UsuarioCurso;

public interface UsuarioCursoRepository extends JpaRepository<UsuarioCurso, Long> {
	
	List<UsuarioCurso> findAllByUsuarioId(Long usuarioId);

}
