package top.kass.dao;

import top.kass.model.User;

public interface UserDao {

    public User getByUsername(String username);

}