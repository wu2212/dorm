package com.project.restroom.service.impl;

import com.project.restroom.mapper.Loginmapper;
import com.project.restroom.service.loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Loginserviceimpl implements loginservice {

    @Autowired Loginmapper loginmapper;

    @Override
    public void login() {
        loginmapper.login();
    }
}
