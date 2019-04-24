package com.example.service;

import com.example.entity.User;

import java.util.List;

/**
 * Created with IDEA
 * author : chengbaiming
 * Date : 2019/4/24 0024
 * Time : 下午 1:35
 */
public interface UserService {
    List<User> selectAll();

    int insert(User user);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(User user);
}
