package br.com.backend.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario_curso")
public class UsuarioCurso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario_curso")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "fk_curso", referencedColumnName = "id_curso")
	private Curso curso;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
