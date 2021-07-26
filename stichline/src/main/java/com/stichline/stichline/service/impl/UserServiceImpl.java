package com.stichline.stichline.service.impl;


import com.stichline.stichline.entity.User;
import com.stichline.stichline.repo.UserRepo;
import com.stichline.stichline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> all =userRepo.findAll();
        return all;
    }

    @Override
    public User getOneuserByuserName(String userName) {
        return userRepo.findByuserName(userName);
    }
}
