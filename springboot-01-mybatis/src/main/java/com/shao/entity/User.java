package com.shao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class User {
    @TableId( type = IdType.AUTO)
    private Integer id;
    private String name;
    private String pwd;
    private String nick_name;
    private Integer age;
    private String sex;
    private String address;
}
