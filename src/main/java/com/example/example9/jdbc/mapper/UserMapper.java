package com.example.example9.jdbc.mapper;

import com.example.example9.jdbc.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by levont on 21/03/2017.
 */
public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setName("Gor");
        user.setAge(24);
        return user;
    }
}
