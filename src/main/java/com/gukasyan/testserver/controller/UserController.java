package com.gukasyan.testserver.controller;

import com.gukasyan.testserver.models.User;
import com.gukasyan.testserver.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/get-all")
    public List<User> getUsers() {
        return userDao.getAllUsers();
    }

    @PostMapping("/user/save")
    public void save(@RequestBody User user) {
        userDao.save(user);
    }

    @PostMapping("/user/delete")
    public void delete(@RequestBody User user) {
        userDao.delete(user);
    }
}
