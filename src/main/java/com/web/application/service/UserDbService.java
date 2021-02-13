package com.web.application.service;

import com.web.application.domain.User;
import com.web.application.repository.UserDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserDbService {

    @Autowired
    private UserDAO repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(final int id) {
        return repository.findById(id).orElse(null);
    }

    public User saveUser(final User user) {
        return repository.save(user);
    }


    public void deleteUser(final int id) {
        repository.deleteById(id);
    }
}
