package com.example.example9.jdbc.user.impl;

import com.example.example9.jdbc.model.User;
import com.example.example9.jdbc.user.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by levont on 21/03/2017.
 */
public class UserDaoImpl implements UserDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, int age) {
        String query = "insert into user (name, age) values (?, ?)";
        jdbcTemplate.update(query, name, age);
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public List<User> listUsers() {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id, String name, int age) {

    }
}
