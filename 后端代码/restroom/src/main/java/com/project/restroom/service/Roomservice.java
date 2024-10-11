package com.project.restroom.service;

import com.project.restroom.pojo.room;

import java.util.List;

public interface Roomservice {
    //查询所有
    List<room> getAllroom();
    //查询一个
    room getRoomById(int id);
    //增
    void addRoom(room room);
    //删
    void deleteRoom(int id);
    //改
    void updateRoom(room room);
}
