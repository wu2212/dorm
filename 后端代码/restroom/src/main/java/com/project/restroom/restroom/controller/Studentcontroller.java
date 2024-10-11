package com.project.restroom.controller;

import com.project.restroom.pojo.Result;
import com.project.restroom.pojo.student;
import com.project.restroom.service.Studentservice;
import com.project.restroom.service.impl.Studentserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    Result<student> getstudentbyid(@PathVariable int id){
        student student = studentservice.getStudentById(id);
        return  Result.success(student);
    }

    @PostMapping
    Result addstudent(@RequestBody student student){
        studentservice.addStudent(student);
        return Result.success("添加成功");
    }

    @DeleteMapping("/{id}")
    Result deletestudent(@PathVariable int id){
        studentservice.deleteStudent(id);
        return Result.success("删除成功");
    }

    @PutMapping
    Result updatestudent(@RequestBody student student){
        System.out.println("调用");
        studentservice.updateStudent(student);
        return Result.success("修改成功");
    }

}
