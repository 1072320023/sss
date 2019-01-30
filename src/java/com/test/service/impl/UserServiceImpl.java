package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.dao.impl.UserDaoImpl;
import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public User getUser(Integer uid){

        System.out.println("调用userserviceimpl");
        return userDao.getUser(uid);

    }
    // 注入事务管理
    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    public void saveUser(User user){
        userDao.saveUser(user);
    }

}
