package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    public User get(Long id);

    public List<User> getAll();

    public void save(User user);

    public void update(User user);

    public void delete(Long id);
}
