package top.cllccc.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cllccc.exam.dao.common.dao.UserMapper;
import top.cllccc.exam.domain.User;

/**
 * <h1>系统用户管理</h1>
 *
 * @Author: CCC
 * @Date 2019/8/26 10:09
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User findUserById(int userid){
        User user = new User();
        user.setId(userid);
        return userMapper.selectOne(user);
    }

    public User findUserByNo(String userNo){
        User user = new User();
        user.setNo(userNo);
        return userMapper.selectOne(user);
    }

    public User loginUser(User user){
        user.setId(null);
        user.setIdentity(null);
        return userMapper.selectOne(user);
    }
}
