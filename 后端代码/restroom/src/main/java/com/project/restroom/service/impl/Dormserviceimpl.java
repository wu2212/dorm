package com.project.restroom.service.impl;

import com.project.restroom.mapper.Dormmapper;
import com.project.restroom.pojo.dorm;
import com.project.restroom.service.Dormservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Dormserviceimpl implements Dormservice {

    @Autowired private Dormmapper dormmapper;

    @Override
    public List<dorm> getAllDorms() {
        return dormmapper.getAlldorm();
    }

    @Override
    public dorm getDormById(int id) {
        return dormmapper.getdormById(id);
    }

    @Override
    public void addDorm(dorm dorm) {
        dormmapper.insertdorm(dorm);
    }

    @Override
    public void updateDorm(dorm dorm) {
        dormmapper.updatedorm(dorm);
    }

    @Override
    public void deleteDorm(int id) {
        dormmapper.deletedorm(id);
    }
}
