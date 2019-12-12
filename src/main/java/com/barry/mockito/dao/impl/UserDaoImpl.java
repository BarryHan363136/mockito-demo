package com.barry.mockito.dao.impl;

import com.barry.mockito.dao.UserDao;
import com.barry.mockito.entity.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public Integer save(User user) {
        return null;
    }

    @Override
    public List<User> findUsers() {
        List<User> list = new ArrayList<>();
        for (int i=10000;i<10006;i++){
            User user = new User();
            user.setId(i+"");
            user.setName("UN-"+i);
            user.setGender(i % 2==0 ? "male" : "female");
            user.setAge(30);
            user.setBirthDay(new Date());
            user.setAddress("address-"+i);
            list.add(user);
        }
        return list;
    }

}
