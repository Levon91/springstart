package com.example.example9.jdbc.user;

import com.example.example9.jdbc.model.User;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by levont on 21/03/2017.
 */
public interface UserDao {

    void setDataSource(DataSource dataSource);

    void create(String name, int age);

    User getUser(long id);

    List<User> listUsers();

    void delete(long id);

    void update(long id, String name, int age);
}
