package com.mahmud.mastering_spring_data_jpa.course;

import com.mahmud.mastering_spring_data_jpa.teacher.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @PostMapping("/assign")
    public Course assignTeacher(@RequestBody AssignTeacherResponse assignTeacherResponse){
        Course course = assignTeacherResponse.getCourse();
        Teacher teacher = assignTeacherResponse.getTeacher();
        course.setTeacher(teacher);
        return courseRepository.save(course);
    }
}
