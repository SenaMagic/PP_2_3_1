package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> listUsers();

    void updateUser(long id, User user);

    void deleteUser(long id);

    long getId(User user);

    User getUserById(long id);

}
