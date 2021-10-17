package com.example.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.example.forum.model.Topic;

public class TopicDTO {
    private Long id;
    private String title;
    private String message;
    private LocalDateTime creationDate;

    public TopicDTO(Topic topic){
        this.id = topic.getId();
        this.title = topic.getTitle();
        this.message = topic.getMessage();
        this.creationDate = topic.getCreationDate();

    }
    public TopicDTO(){

    }

    public static List<TopicDTO> convert(List<Topic> topics) {
        return topics.stream().map(TopicDTO::new).collect(Collectors.toList());
    }

    public static TopicDTO convert(Topic topic) {
        TopicDTO topicDTO = new TopicDTO();
        topicDTO.id = topic.getId();
        topicDTO.message = topic.getMessage();
        topicDTO.title = topic.getTitle();
        topicDTO.creationDate = topic.getCreationDate();
        return topicDTO;
    }

    public long getId() {
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
}
