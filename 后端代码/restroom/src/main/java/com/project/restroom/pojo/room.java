package com.project.restroom.pojo;

import lombok.Data;

@Data
public class room {
    private int id;
    private String room_id;
    //居住人数
    private String number;
    //房间所属楼层
    private String dorm_name;
    //房间最大居住人数
    private String maxnumber;
}
