package com.mahmud.mastering_spring_data_jpa.course;

import com.mahmud.mastering_spring_data_jpa.teacher.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignTeacherResponse {
    private Teacher teacher;
    private Course course;
}
