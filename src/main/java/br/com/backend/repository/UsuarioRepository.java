package br.com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
