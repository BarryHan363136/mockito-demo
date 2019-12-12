package com.barry.mockito.dao;

import com.barry.mockito.entity.User;
import java.util.List;

public interface UserDao {

    public Integer save(User user);

    public List<User> findUsers();

}
