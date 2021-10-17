package com.example.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.forum.model.Course;
import com.example.forum.model.Topic;
import com.example.forum.repository.CourseRepository;
import org.hibernate.validator.constraints.Length;


public class TopicForm {
    @NotNull @NotEmpty @Length(min = 5)
    private String title;
    @NotNull @NotEmpty @Length(min = 10)
    private String message;
    @NotNull @NotEmpty
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
