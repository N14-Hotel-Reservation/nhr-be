package com.adelaide.nhrbackend.service;

import com.adelaide.nhrbackend.dto.UserCreateRequest;
import com.adelaide.nhrbackend.entity.User;
import com.adelaide.nhrbackend.enums.Gender;

public interface UserService {

    User getById(String id);

    User getByUsername(String id);

    void delete(String id);

    User create(UserCreateRequest userCreateRequest);

    User getByGender(Gender gender);

}
