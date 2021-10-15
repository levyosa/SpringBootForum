package com.example.forum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topic {

	private Long id;
	private String title;
	private String message;
	private LocalDateTime creationDate = LocalDateTime.now();
	private TopicSatus status = TopicSatus.NOT_ANSWERED;
	private User author;
	private Course course;
	private List<Answer> answers = new ArrayList<>();

	public Topic(String title, String message, Course course) {
		this.id = 0L;
		this.title = title;
		this.message = message;
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
		Topic other = (Topic) obj;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public TopicSatus getStatus() {
		return status;
	}

	public void setStatus(TopicSatus status) {
		this.status = status;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
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
