package com.example.forum.controller;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import com.example.forum.repository.TopicRepository;
import com.example.forum.controller.dto.TopicDTO;
import com.example.forum.controller.form.TopicForm;
import com.example.forum.model.Topic;
import com.example.forum.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @GetMapping
    public List<TopicDTO> list(String courseName,Long id){
        if (courseName != null){
            List<Topic> topics = topicRepository.findByCourseName(courseName);
            return TopicDTO.convert(topics);
        }

        List<Topic> topics = topicRepository.findAll();
        return TopicDTO.convert(topics);

    }

    @PostMapping
    public ResponseEntity<TopicDTO> create(@RequestBody @Valid TopicForm topicForm, UriComponentsBuilder uriComponentsBuilder){
        Topic topic = topicForm.convert(courseRepository);
        topicRepository.save(topic);

        URI uri = uriComponentsBuilder.path("/topics/{id}").buildAndExpand(topic.getId()).toUri();
        return ResponseEntity.created(uri).body(new TopicDTO(topic));
    }

    @GetMapping("/{id}")
    public TopicDTO retrieve(@PathVariable Long id){
        Topic topic = topicRepository.getById(id);
        return TopicDTO.convert(topic);
    }





    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private CourseRepository courseRepository;
}
