package dao;


import com.xuexi.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.xuexi.pojo.User;
import com.xuexi.utils.MybatisUtils;

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
}
