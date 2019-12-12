package com.barry.mockito.service;

import com.barry.mockito.entity.User;
import java.util.List;

public interface UserService {

    public Integer save(User user);

    public List<User> findUsers();

}
