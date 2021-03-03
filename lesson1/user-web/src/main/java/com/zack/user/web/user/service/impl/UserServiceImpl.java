package com.zack.user.web.user.service.impl;

import com.zack.user.web.user.domain.User;
import com.zack.user.web.user.service.UserService;

/**
 * @author zhouze
 * @date 2021/3/3
 */
public class UserServiceImpl implements UserService {


    @Override
    public boolean register(User user) {
        return false;
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}
