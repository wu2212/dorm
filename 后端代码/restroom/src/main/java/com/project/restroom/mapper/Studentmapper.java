package com.project.restroom.mapper;

import com.project.restroom.pojo.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Studentmapper {

    @Select("select * from student")
    List<student> selectAllstudent();
}
