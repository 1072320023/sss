package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.entity.User;
import com.test.service.UserService;

public class UserServiceImpl implements UserService {
    //@Resource
    private UserDao userDao;
    //@Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public User getUser(Integer uid){
        return userDao.getUser(uid);
    }
    // 注入事务管理
    //@Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public void saveUser(User user){
        userDao.saveUser(user);
    }

}
