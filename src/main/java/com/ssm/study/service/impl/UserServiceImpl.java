package com.ssm.study.service.impl;

import com.ssm.study.dao.UserMapper;
import com.ssm.study.domain.User;
import com.ssm.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
