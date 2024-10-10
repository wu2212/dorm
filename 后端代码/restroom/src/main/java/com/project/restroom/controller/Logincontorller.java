package com.project.restroom.controller;

import com.project.restroom.mapper.Loginmapper;
import com.project.restroom.service.impl.Loginserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class Logincontorller {

    @Autowired private Loginserviceimpl loginservice;

    @GetMapping
    public void login(){
        loginservice.login();
    }
}
