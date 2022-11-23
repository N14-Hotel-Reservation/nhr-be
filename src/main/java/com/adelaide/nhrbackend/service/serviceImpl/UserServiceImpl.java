package com.adelaide.nhrbackend.service.serviceImpl;

import com.adelaide.nhrbackend.entity.User;
import com.adelaide.nhrbackend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getById(String id) {
        return null;
    }

    @Override
    public User getByUsername(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
