package com.project.restroom.controller;

import com.project.restroom.pojo.Result;
import com.project.restroom.pojo.dorm;
import com.project.restroom.service.impl.Dormserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dorm")
public class Dormcontroller {

    @Autowired private Dormserviceimpl dormservice;


    @GetMapping()
    Result<List<dorm>>  getAllDorm(){
        List<dorm> allDorms = dormservice.getAllDorms();
        return Result.success(allDorms);
    }
    @GetMapping("/{id}")
    Result<dorm> getDormById(@PathVariable int id){
        dorm dorm = dormservice.getDormById(id);
        return Result.success(dorm);
    }

    @DeleteMapping("/{id}")
    Result deleteDormById(@PathVariable int id){
        dormservice.deleteDorm(id);
        return Result.success("删除成功");
    }

    @PostMapping()
    Result addDorm(@RequestBody dorm dorm){
        dormservice.addDorm(dorm);
        return Result.success("添加成功");
    }
    @PutMapping()
    Result updateDorm(@RequestBody dorm dorm){
        dormservice.updateDorm(dorm);
        return Result.success("修改成功");
    }
}
