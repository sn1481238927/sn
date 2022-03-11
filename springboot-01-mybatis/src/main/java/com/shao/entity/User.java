package com.shao.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@TableName("user")
@Data
public class User {
    @TableId( type = IdType.AUTO)
    private Integer id;
    private String name;
    private String pwd;
    private String nickName;
    private Integer age;
    private String sex;
    private String address;

//    @Version//乐观锁Version的注解  3.4.0版本已弃用
//    private Integer version;

    //字段填充内容
    @TableField(fill = FieldFill.INSERT)
    private Date creat_time;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date update_time;

    //逻辑删除
    @TableLogic
    private  Integer deleted;
}
