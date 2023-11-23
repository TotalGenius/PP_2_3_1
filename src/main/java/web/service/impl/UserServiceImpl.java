package web.service.impl;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.entity.User;
import web.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User get(Long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
