package com.example.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.example.forum.model.Answer;

public class AnswerDTO {
    private Long id;
    private String message;
    private LocalDateTime creationDate;
    private String authorName;

    public AnswerDTO(Answer answer) {
        this.id = answer.getId();
        this.authorName = answer.getAuthor().getName();
        this.message = answer.getMessage();
        this.creationDate = answer.getCreationDate();

    }

    public static List<AnswerDTO> convert(List<Answer> answers) {
        return answers.stream().map(AnswerDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getAuthorName() {
        return authorName;
    }
}
