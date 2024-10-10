package com.project.restroom.service.impl;

import com.project.restroom.mapper.Studentmapper;
import com.project.restroom.pojo.student;
import com.project.restroom.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Studentserviceimpl implements Studentservice {

    @Autowired
    private Studentmapper studentmapper;
    @Override
    public List<student> getAllStudents() {
        return studentmapper.selectAllstudent();
    }
}
