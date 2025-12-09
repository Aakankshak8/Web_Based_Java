package com.demo.mapper;

import com.demo.beans.Student;
import com.demo.dto.StudentDto;

public class StudentMapper {

    // Convert DTO → Entity
    public static Student mapToStudent(StudentDto dto) {
        if (dto == null) {
            return null;
        }
        // Since StudentDTO doesn’t have address, we set it to null
        return new Student(
            dto.getSid(),
            dto.getSname(),
            dto.getEmail(),
            dto.getPercentage(),
            null
        );
    }

    // Convert Entity → DTO
    public static StudentDto mapToStudentDTO(Student student) {
        if (student == null) {
            return null;
        }
        return new StudentDto(
            student.getSid(),
            student.getSname(),
            student.getEmail(),
            student.getPercentage()
        );
    }
}
