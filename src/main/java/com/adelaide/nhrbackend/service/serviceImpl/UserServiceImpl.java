package com.adelaide.nhrbackend.service.serviceImpl;

import com.adelaide.nhrbackend.dto.UserCreateRequest;
import com.adelaide.nhrbackend.entity.User;
import com.adelaide.nhrbackend.enums.Gender;
import com.adelaide.nhrbackend.repository.UserRepository;
import com.adelaide.nhrbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getById(String id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()){
            //TODO
        }
        return user.get();
    }

    @Override
    public User getByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        if (!user.isPresent()){
            //TODO
        }
        return user.get();
    }

    @Override
    public void delete(String id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()){
            //TODO
        }
        userRepository.delete(user.get());
    }

    @Override
    public User create(UserCreateRequest userCreateRequest) {
        User user = new User();
        user.setUsername(userCreateRequest.getUsername());
        user.setPassword(userCreateRequest.getPassword());
        //TODO

        return userRepository.save(user);
    }

    @Override
    public User getByGender(Gender gender) {
        Optional<User> user = userRepository.findByGender(gender);
        if (!user.isPresent()){
            //todo 增加错误类型
        }
        return user.get();
    }

    private void checkUserName(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()) {

        }
    }

}
