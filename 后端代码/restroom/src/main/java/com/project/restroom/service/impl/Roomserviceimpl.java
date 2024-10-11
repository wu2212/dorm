package com.project.restroom.service.impl;

import com.project.restroom.mapper.Roommapper;
import com.project.restroom.pojo.room;
import com.project.restroom.service.Roomservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Roomserviceimpl implements Roomservice {

    //查询所有
    //查询一个
    //增
    //删
    //改

    @Autowired private Roommapper roommapper;
    @Override
    public List<room> getAllroom() {
        return roommapper.selectAll();
    }

    @Override
    public room getRoomById(int id) {
        return roommapper.selectById(id);
    }

    @Override
    public void addRoom(room room) {
        roommapper.addRoom(room);
    }

    @Override
    public void deleteRoom(int id) {
        roommapper.deleteRoom(id);
    }

    @Override
    public void updateRoom(room room) {
        roommapper.updateRoom(room);
    }


}
