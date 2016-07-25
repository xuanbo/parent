package com.xuan.web.service.impl;

import com.xuan.web.dao.UserDao;
import com.xuan.web.entity.User;
import com.xuan.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xinQing on 2016/7/25.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User get(Integer id) {
        return userDao.get(id);
    }
}
