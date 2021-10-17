package com.example.forum.controller;
import java.util.List;
import com.example.forum.repository.TopicRepository;
import com.example.forum.controller.dto.TopicDTO;
import com.example.forum.controller.form.TopicForm;
import com.example.forum.model.Topic;
import com.example.forum.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @GetMapping
    public List<TopicDTO> lista (String courseName){
        if (courseName != null){
            List<Topic> topics = topicRepository.findByCourseName(courseName);
            return TopicDTO.convert(topics);
        }
        List<Topic> topics = topicRepository.findAll();
        return TopicDTO.convert(topics);

    }

    @PostMapping
    public void create(@RequestBody TopicForm topic){
        topicRepository.save(topic.convert(courseRepository));
    }



    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private CourseRepository courseRepository;
}
