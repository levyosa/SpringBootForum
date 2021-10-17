package com.example.forum;


import java.util.List;

import com.example.forum.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Long> {


    List<Topic> findByCourseName(String courseName);


}
