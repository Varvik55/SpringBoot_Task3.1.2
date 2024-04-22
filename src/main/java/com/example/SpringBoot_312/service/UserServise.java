package com.example.SpringBoot_312.service;


import com.example.SpringBoot_312.model.User;

import java.util.List;

public interface UserServise {
    List<User> getAllUsers();

    void createOrUpdate (User user);

    User readUser(long id);

    void deleteUser(long id);
}
