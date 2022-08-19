package br.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.modelo.Curso;

public interface CursoRepository extends JpaRepository <Curso, Long> {
		
}
