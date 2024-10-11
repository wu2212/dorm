package com.project.restroom.mapper;

import com.project.restroom.pojo.student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Studentmapper {

    @Select("select * from student")
    List<student> selectAllstudent();

    @Select("select * from student where id = #{id}")
    student getStudentById(int id);

    @Insert("insert into student (student_id,name,sex,classnum,dorm,room) values (#{student_id},#{name},#{sex},#{classnum},#{dorm},#{room})")
    void addStudent(student student);

    @Update("update student set dorm=#{dorm},room=#{room} where student_id = #{student_id}")
    void updateStudent(student student);

    @Delete("delete from student where id = #{id}")
    void deleteStudentById(int id);
}
