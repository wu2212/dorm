package com.project.restroom.service;

import com.project.restroom.pojo.dorm;

import java.util.List;

public interface Dormservice {
    List<dorm> getAllDorms();
    dorm getDormById(int id);
    void addDorm(dorm dorm);
    void updateDorm(dorm dorm);
    void deleteDorm(int id);
}
