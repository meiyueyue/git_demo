package com.xuexi.dao;


import com.xuexi.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Yingxin.li
 * @create 2022-03-09-12:48
 */
public interface UserMapper {
    @Select("select * from mybatistest.user")
    List<User> getUserList();
}
