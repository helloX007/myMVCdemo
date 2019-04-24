package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created with IDEA
 * @author : chengbaiming
 * Date : 2019/4/24 0024
 * Time : 上午 11:22
 */
@Repository("userDao")
public interface UserDao {

    List<User> selectAllUser();

    User selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
}
