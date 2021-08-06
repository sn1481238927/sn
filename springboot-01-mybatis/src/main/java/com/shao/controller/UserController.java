package com.shao.controller;

import com.shao.common.Result;
import com.shao.mapper.UserMapper;
import com.shao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Resource
    UserMapper userMapper;

    @PostMapping
    public Result<?> save(@RequestBody User user){
      userMapper.insert(user);
      return  Result.success();
    }

//    @Autowired
//    private UserMapper userMapper;

//    @GetMapping("/queryUserList")
//    public  List<User> queryUserList(){
//        List<User> userList = userMapper.queryUserList();
//        for (User user: userList){
//            System.out.println(user);
//        }
//        return userList;
//    }
//    @GetMapping("/addUser")
//    public String addUser(){
//        userMapper.addUser(new User(5,"aa","66"));
//        return  "ok";
//    }
}
