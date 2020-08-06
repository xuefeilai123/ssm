package com.ssm.study.service;

import com.ssm.study.domain.User;

import java.util.List;

public interface IUserService {
     User getUserById(int id);

     void deleteUserById(int id);

     void updateUserById(User user);

     void addUser(User user);
}
