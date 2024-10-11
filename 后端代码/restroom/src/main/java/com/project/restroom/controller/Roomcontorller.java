package com.project.restroom.controller;

import com.project.restroom.pojo.Result;
import com.project.restroom.pojo.room;
import com.project.restroom.service.Roomservice;
import com.project.restroom.service.impl.Roomserviceimpl;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class Roomcontorller {


    @Autowired private Roomserviceimpl roomservice;
    //查询所有

    @GetMapping()
    Result<List<room>> getAllroom(){
        return new Result().success(roomservice.getAllroom());
    }
    //查询一个
    @GetMapping("/{id}")
    Result<room> getRoomById(@PathVariable int id){
        return Result.success(roomservice.getRoomById(id));
    }
    //增

    @PostMapping
    Result addRoom(@RequestBody room room){
        roomservice.addRoom(room);
        return Result.success("添加成功");
    }
    //删
    @DeleteMapping("/{id}")
    Result deleteRoomById(@PathVariable int id){
        roomservice.deleteRoom(id);
        return Result.success("删除成功");
    }

    @PutMapping()
    Result updateroom(@RequestBody room room){
        roomservice.updateRoom(room);
        return Result.success("修改成功");
    }
    //改
}
