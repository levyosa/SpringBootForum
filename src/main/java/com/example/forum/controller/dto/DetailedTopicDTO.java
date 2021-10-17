package com.example.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.forum.model.Topic;
import com.example.forum.model.TopicSatus;

public class DetailedTopicDTO {
    private Long id;
    private String title;
    private String message;
    private LocalDateTime creationDate;
    private String authorName;
    private TopicSatus status;
    private List<AnswerDTO> answers;


    public DetailedTopicDTO(Topic topic) {
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.creationDate = topic.getCreationDate();
        this.authorName = topic.getAuthor().getName();
        this.status = topic.getStatus();
        this.answers = AnswerDTO.convert(topic.getAnswers());
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public TopicSatus getStatus() {
        return status;
    }

    public List<AnswerDTO> getAnswers() {
        return answers;
    }
}
