package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User showUser(int id);

    void saveUser(User user);

    void deleteUser(int id);

    public User findByUsername(String username);

}
