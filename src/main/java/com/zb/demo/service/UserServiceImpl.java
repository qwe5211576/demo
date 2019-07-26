package com.zb.demo.service;

import com.zb.demo.dao.UserMapper;
import com.zb.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper um;

    @Override
    public List<User> findAll(User user) {

        return um.findAll(user);
    }

    @Override
    public Integer delete(String id) {

        Integer count = um.delete(id);
        return count;
    }

}
