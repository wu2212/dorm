package com.project.restroom.service;

import com.project.restroom.pojo.student;

import java.util.List;

public interface Studentservice {
    List<student> getAllStudents();

    student getStudentById(int id);

    void addStudent(student student);

    void updateStudent(student student);

    void deleteStudent(int id);
}
