package com.project.restroom.mapper;

import com.project.restroom.pojo.dorm;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Dormmapper {

    //查询全部

    @Select("select * from dorm")
    List<dorm> getAlldorm();

    //查询一个
    @Select("select * from dorm where id = #{id}")
    dorm getdormById(int id);
    //添加
    @Insert("insert into dorm (name,room_num) values (#{name},#{room_num})")
    void insertdorm(dorm dorm);
    //删除
    @Delete("delete from dorm where id=#{id}")
    void deletedorm(int id);
    //修改
    @Update("update dorm set name = #{name},room_num=#{room_num} where id = #{id}")
    void updatedorm(dorm dorm);

}
