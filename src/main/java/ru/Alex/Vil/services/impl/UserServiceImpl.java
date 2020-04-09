package ru.Alex.Vil.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Alex.Vil.models.User;
import ru.Alex.Vil.repository.UserRepository;
import ru.Alex.Vil.services.UserService;

import javax.transaction.Transactional;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User postUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User putUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public String delUser(Integer id) {
        userRepository.deleteById(id);
        return "udalil user" + id;
    }


    @Override
    public List<User> getSql() {
        return userRepository.prmSql();
    }

    @Transactional
    @Override
    public void voidSql() {
        userRepository.sqlUpdata();
    }

}
