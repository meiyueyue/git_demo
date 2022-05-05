package com.xuexi.dao;

import com.xuexi.pojo.User;

import java.util.List;

/**
 * @author Yingxin.li
 * @create 2022-03-09-12:48
 */
public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);
}
