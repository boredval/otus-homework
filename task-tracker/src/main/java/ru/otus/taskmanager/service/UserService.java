package ru.otus.taskmanager.service;

import ru.otus.taskmanager.model.user.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User changeRoleToAdmin(User user);

    List<User> findAll();

    User getUserByEmail(String email);

    boolean isUserEmailPresent(String email);

    User getUserById(Long userId);

    void deleteUser(Long id);

}
