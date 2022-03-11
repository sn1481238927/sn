package com.shao.dto;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@TableName("user")
@Data
public class User {
    @TableId( type = IdType.AUTO)
    private Integer id;
    private String user_name;
    private String user_password;
}
