package com.stichline.stichline.service;


import com.stichline.stichline.entity.User;

import java.util.List;

public interface UserService {
void saveUser(User user);
List<User> getAllUsers();
    User getOneuserByuserName(String userName);
}
