package com.project.restroom.controller;

import com.project.restroom.pojo.Result;
import com.project.restroom.pojo.student;
import com.project.restroom.service.impl.Studentserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

    @Autowired private Studentserviceimpl studentservice;
    @GetMapping
    Result<List<student>> getallstudent(){
        List<student> allStudents = studentservice.getAllStudents();
        return  Result.success(allStudents);
    }

}
