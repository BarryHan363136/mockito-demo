package com.barry.mockito.service.impl;

import com.barry.mockito.dao.UserDao;
import com.barry.mockito.entity.User;
import com.barry.mockito.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer save(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> findUsers() {
        return userDao.findUsers();
    }
}
