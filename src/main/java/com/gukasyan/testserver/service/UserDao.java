package com.gukasyan.testserver.service;

import com.gukasyan.testserver.models.User;
import com.gukasyan.testserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDao {

    @Autowired
    private UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(users::add);
        return users;
    }

    public User findUserByName(String name) {
        return repository.findUserByName(name);
    }
}
