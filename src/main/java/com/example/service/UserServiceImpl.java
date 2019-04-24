package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * author : chengbaiming
 * Date : 2019/4/24 0024
 * Time : 下午 1:37
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public List<User> selectAll() {
        return userDao.selectAllUser();
    }

    @Override
    public int insert(User user) {

        return userDao.insert(user);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user);
    }
}
