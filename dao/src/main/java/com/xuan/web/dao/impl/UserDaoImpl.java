package com.xuan.web.dao.impl;

import com.xuan.web.dao.UserDao;
import com.xuan.web.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by xinQing on 2016/7/25.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public User get(Integer id) {
        return new User(id, "王漩波", "xuanbo");
    }
}
