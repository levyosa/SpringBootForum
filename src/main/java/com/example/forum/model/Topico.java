package com.example.forum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topico {

	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	private TopicSatus status = TopicSatus.NOT_ANSWERED;
	private User autor;
	private Course course;
	private List<Answer> answers = new ArrayList<>();

	public Topico(String titulo, String mensagem, Course course) {
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topico other = (Topico) obj;
		if (id == null) {
			return other.id == null;
		} else return id.equals(other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public TopicSatus getStatus() {
		return status;
	}

	public void setStatus(TopicSatus status) {
		this.status = status;
	}

	public User getAutor() {
		return autor;
	}

	public void setAutor(User autor) {
		this.autor = autor;
	}

	public Course getCurso() {
		return course;
	}

	public void setCurso(Course course) {
		this.course = course;
	}

	public List<Answer> getRespostas() {
		return answers;
	}

	public void setRespostas(List<Answer> answers) {
		this.answers = answers;
	}

}
