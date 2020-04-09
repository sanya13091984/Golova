package ru.Alex.Vil.services;

import ru.Alex.Vil.models.User;

import java.util.List;

public interface UserService {

    Iterable<User> getAllUsers();

    User postUser(User user);

    User putUser(User user);

    String delUser(Integer id);

    List<User> getSql();

    void voidSql();

}
