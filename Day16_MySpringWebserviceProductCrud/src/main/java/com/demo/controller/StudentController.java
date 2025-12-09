package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService sservice;

   
    @GetMapping("/api/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(sservice.getAllStudent());
    }

  
    @GetMapping("/api/students/{sid}")
    public ResponseEntity<Student> getById(@PathVariable int sid) {
        Student s = sservice.getById(sid);
        if (s != null)
            return ResponseEntity.ok(s);
        else
            return ResponseEntity.notFound().build();
    }

    
    @PostMapping("/api/students")
    public ResponseEntity<String> addStudent(@RequestBody Student s) {
        boolean status = sservice.addStudent(s);
        if (status)
            return ResponseEntity.ok("Student added successfully");
        else
            return ResponseEntity.ok("Error occurred");
    }

    
    @PutMapping("/api/students")
    public ResponseEntity<String> updateStudent(@RequestBody Student s) {
        boolean status = sservice.updateStudent(s);
        if (status)
            return ResponseEntity.ok("Student updated successfully");
        else
            return ResponseEntity.ok("Error occurred");
    }


    @DeleteMapping("/api/students/{sid}")
    public ResponseEntity<String> deleteStudent(@PathVariable int sid) {
        boolean status = sservice.deleteById(sid);
        if (status)
            return ResponseEntity.ok("Student deleted successfully");
        else
            return ResponseEntity.ok("Error occurred");
    }
}
