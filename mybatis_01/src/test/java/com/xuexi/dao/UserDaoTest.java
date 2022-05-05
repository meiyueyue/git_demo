package com.xuexi.dao;

import com.xuexi.pojo.User;
import com.xuexi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author Yingxin.li
 * @create 2022-03-09-14:06
 */
public class UserDaoTest {
    @Test
    public void getUserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.addUser(new User(2,"小明", "123456"));
        if(result > 0){
            System.out.println("插入成功~");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
