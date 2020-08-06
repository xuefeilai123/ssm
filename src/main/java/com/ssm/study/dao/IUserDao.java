package com.ssm.study.dao;

import com.ssm.study.domain.User;

public interface IUserDao {
    User selectUserById(int id);

}
