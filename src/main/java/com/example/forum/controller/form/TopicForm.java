package com.example.forum.controller.form;

import com.example.forum.model.Course;
import com.example.forum.model.Topic;
import com.example.forum.repository.CourseRepository;

public class TopicForm {
    private String title;
    private String message;
    private String courseName;

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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Topic convert(CourseRepository courseRepository) {

        Course course = courseRepository.findByName(this.courseName);
        return new Topic(this.title,this.message,course);

    }
}
