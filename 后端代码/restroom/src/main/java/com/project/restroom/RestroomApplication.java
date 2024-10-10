package com.project.restroom;

import com.project.restroom.controller.Logincontorller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class RestroomApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestroomApplication.class, args);
    }

}
