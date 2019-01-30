package com.test.service;

import com.test.entity.User;
import org.springframework.stereotype.Repository;


public interface UserService {
    User getUser(Integer uid);
    void saveUser(User user);
}
