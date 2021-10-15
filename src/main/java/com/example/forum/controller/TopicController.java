package com.example.forum.controller;


import java.util.Arrays;
import java.util.List;

import com.example.forum.controller.dto.TopicDTO;
import com.example.forum.model.Course;
import com.example.forum.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<TopicDTO> lista (){
        Topic topic = new Topic("Dúvida","duvida com spring",new Course("Spring","Programacao"));
        return TopicDTO.convert(Arrays.asList(topic,topic,topic,topic));

    }
}
