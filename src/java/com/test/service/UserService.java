package com.test.service;

import com.test.entity.User;

public interface UserService {
    User getUser(Integer uid);
    void saveUser(User user);
}
