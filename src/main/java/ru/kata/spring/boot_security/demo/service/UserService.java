package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    public User findUserById(Integer id);
    public List<User> allUsers();
    public boolean saveUser(User user);
    public boolean deleteUser(int id);
    public void addUser(User user);
    public List<Role> findRoles();
}
