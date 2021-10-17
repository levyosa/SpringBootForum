package com.example.forum.controller;
import java.util.List;
import com.example.forum.TopicRepository;
import com.example.forum.controller.dto.TopicDTO;
import com.example.forum.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<TopicDTO> lista (String courseName){
        List<Topic> topics = topicRepository.findAll();
        return TopicDTO.convert(topics);

    }





    @Autowired
    private TopicRepository topicRepository;
}
