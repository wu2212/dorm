package com.project.restroom.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Loginmapper {

    @Insert("insert into admin (username,password) values ('123456','112233')")
    void login();
}
