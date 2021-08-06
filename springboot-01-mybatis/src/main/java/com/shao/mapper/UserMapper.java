package com.shao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

//    IPage<User> selectPageVo(Page<?> page, Integer state);
//    List<User> queryUserList();
//
//    User queryUserById(int id);
//
//    int  addUser(User user);
//
//    int updateUser(User user);
//
//    int deleteUser(int id);
}

