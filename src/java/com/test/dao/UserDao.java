package com.test.dao;

import com.test.entity.User;

public interface UserDao {
    User getUser(Integer uid);
    void saveUser(User user);

}
