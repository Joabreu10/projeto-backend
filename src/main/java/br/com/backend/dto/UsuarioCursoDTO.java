package br.com.backend.dto;

import java.util.List;

import br.com.backend.modelo.Curso;
import br.com.backend.modelo.Usuario;

public class UsuarioCursoDTO {
	
	private Usuario usuario; 
	private List<Curso> cursos;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
