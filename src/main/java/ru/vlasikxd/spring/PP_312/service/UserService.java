package ru.vlasikxd.spring.PP_312.service;


import ru.vlasikxd.spring.PP_312.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getListUsers();
    void removeUserById(Long id);

    User getUserById(Long id);

    void updateUser(User user);
}
