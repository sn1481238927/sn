package com.shao.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shao.common.Result;
import com.shao.mapper.UserMapper;
import com.shao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Resource
    UserMapper userMapper;

    @PostMapping
    public Result<?> save(@RequestBody User user){
        if(user.getPwd()==null){
            user.setPwd("77777");
        }
      userMapper.insert(user);
      return  Result.success();
    }

    @PutMapping
    public Result<?> updata(@RequestBody User user){
        userMapper.updateById(user);
        return  Result.success();
    }

    @DeleteMapping("/{id}")
    public Result<?> updata(@PathVariable Long id){
        userMapper.deleteById(id);
        return  Result.success();
    }

    @PostMapping("/login")
    public Result<?> login(@RequestBody User user){
        User res=userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getName,user.getName()).eq(User::getPwd,user.getPwd()));
        if(res==null){
            return Result.error("-1","用户名或密码错误");
        }
        return  Result.success();
    }

    @PostMapping("/register")
    public Result<?> register(@RequestBody User user){
        User res=userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getName,user.getName()).eq(User::getPwd,user.getPwd()));
        if(res!=null){
            return Result.error("-1","用户名重复");
        }
        if(user.getPwd()==null){
            user.setPwd("123456");
        }
        userMapper.insert(user);
        return  Result.success();
    }

    @GetMapping
    public Result<?> finePage(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "10") Integer pageSize,
                              @RequestParam(defaultValue = "") String search){
        LambdaQueryWrapper<User> wrapper=Wrappers.<User>lambdaQuery();
        if(StrUtil.isNotBlank(search)){
           wrapper.like(User::getNickName,search);
        }
        Page<User> userPage = userMapper.selectPage(new Page<>(pageNum, pageSize),wrapper);
        return  Result.success(userPage);
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
