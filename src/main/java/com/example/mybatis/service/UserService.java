package com.example.mybatis.service;

import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Transactional
    public User queryByid(int id){
        User user = (User) userMapper.queryByid(id);
        return user;
    }


}
