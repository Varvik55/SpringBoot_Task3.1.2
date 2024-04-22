package com.example.SpringBoot_312.service;

import com.example.SpringBoot_312.model.User;
import com.example.SpringBoot_312.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@Transactional
public class UserServiseImpl implements UserServise{
    private final UserRepository userRepository;

    public UserServiseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createOrUpdate(User user) {
            userRepository.save(user);
    }

    @Override
    public User readUser(long id) {
        return userRepository.getById(id);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }


}
