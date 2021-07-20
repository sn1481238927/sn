package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//员工表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employe {

    private Integer id;
    private String lastname;
    private String email;
    private Integer gender;//0:女，1：男
    private Department department;
    private Date birth;

    public Employe(Integer id, String lastname, String email, Integer gender, Department department) {
        this.id = id;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.department = department;
        //默认的日期创建
        this.birth = new Date();
    }
}
