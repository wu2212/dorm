package com.project.restroom.mapper;

import com.project.restroom.pojo.room;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Roommapper {
    //查询所有
    @Select("select * from room")
    List<room> selectAll();
    //查询一个
    @Select("select * from room where id = #{id}")
    room selectById(int id);
    //增
    @Insert("insert into room (room_id,number,dorm_name,maxnumber) values (#{room_id},#{number},#{dorm_name},#{maxnumber})")
    void addRoom(room room);
    //删
    @Delete("delete from room where id = #{id}")
    void deleteRoom(int id);
    //改
    @Update("update room set number = #{number} where id = #{id}")
    void updateRoom(room room);


}
