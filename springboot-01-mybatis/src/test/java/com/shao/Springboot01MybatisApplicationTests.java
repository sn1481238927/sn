package com.shao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shao.entity.User;
import com.shao.mapper.UserMapper;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.websocket.server.PathParam;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//@SpringBootTest
//class Springboot01MybatisApplicationTests {
//
//    @Autowired
//    private UserMapper userMapper;
//
////        @Autowired
////    DataSource dataSource;
////
////    @Test
////    void contextLoads() throws SQLException {
////        System.out.println(dataSource.getClass());
////        System.out.println(dataSource.getConnection());
////    }
//      @Test
//      public void testUpdate(){
//          User user1 = userMapper.selectById(9);
//          System.out.println(user1);
//         // User user = new User();
//          //user.setId(6);
////          user.setName("大啊哒哒哒");
////          userMapper.insert(user);
////          int i = userMapper.updateById(user);
//      }
//
//      //测试批量查询
//      @Test
//      public void testOptimisticlocker(){
//          List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 6, 8));
//          users.forEach(System.out::println);
//
//      }
//
//      //条件查询
//      @Test
//      public void test(){
//          HashMap<String, Object> map = new HashMap<>();
//          //自定义查询
//          map.put("name","dod");
//          map.put("sex","男");
//          List<User> users = userMapper.selectByMap(map);
//          users.forEach(System.out::println);
//      }
//
//      //分野查询
//    @Test
//    public void testfen(){
//        Page<User> page = new Page<>(2,6);
//        userMapper.selectPage(page,null);
//        page.getRecords().forEach(System.out::println);
//        System.out.println(page.getTotal());
//    }
//
//    //删除操作
//    @Test
//    public void testde(){
//      userMapper.deleteById(9);
//
//    }
//
//    //wrapper查询
//    @Test
//     void wappertest(){
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.between("age",1,20);
//        Integer count = userMapper.selectCount(wrapper);
//        System.out.println(count);
//    }
//}
