package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Java","Rajat"),
                new Course(2,"Python","Rajat"),
                new Course(3,"Azure","Rajat"),
                new Course(4,"GCP","Rajat"),
                new Course(5,"JavaScript","Rajat"),
                new Course(6,"alpha","beta"),
                new Course(7,"asd","sdf"),
                new Course(8,"test","super")
        );

    }
}
