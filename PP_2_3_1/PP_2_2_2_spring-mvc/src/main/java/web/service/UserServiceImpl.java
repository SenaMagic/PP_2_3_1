package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Transactional
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
    @Transactional
    @Override
    public void updateUser(long id, User user) {
        userDao.updateUser(id, user);
    }
    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }
    @Transactional
    @Override
    public long getId(User user) {
        return userDao.getId(user);
    }
    @Transactional
    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
}
