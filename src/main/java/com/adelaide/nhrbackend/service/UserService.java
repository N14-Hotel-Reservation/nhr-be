package com.adelaide.nhrbackend.service;

import com.adelaide.nhrbackend.entity.User;

public interface UserService {

    User getById(String id);

    User getByUsername(String id);

    void delete(String id);

}
