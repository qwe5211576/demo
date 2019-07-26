package com.zb.demo.service;

import com.zb.demo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll(User user);

    public Integer delete(String id);
}
