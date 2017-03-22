package com.example.example9.jdbc.user.impl;

import com.example.example9.jdbc.mapper.UserMapper;
import com.example.example9.jdbc.model.User;
import com.example.example9.jdbc.user.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by levont on 21/03/2017.
 */
public class UserDaoImpl implements UserDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall jdbcCall;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

    @Override
    public void create(String name, int age) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String query = "insert into `user` (name, age) values (?, ?)";
        jdbcTemplate.update(query, name, age);
        System.err.println("created user " + name);
    }

    //    @Override
//    public User getUser(long id) {
//        String query = "select * from `user` where id = ?";
//        User user = jdbcTemplate.queryForObject(query, new Object[]{id}, new UserMapper());
//        if (user != null) {
//            System.err.println("returned user with id " + id);
//            return user;
//        }
//        return null;
//    }
    public User getUser(long id) {
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);

        User student = new User();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        return student;
    }

    @Override
    public List<User> listUsers() {
        String query = "select * from `user`";
        List<User> users = jdbcTemplate.query(query, new UserMapper());
        if (users != null) {
            System.err.println("list of students " + users);
            return users;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        String query = "delete from `user` where id = ?";
        jdbcTemplate.update(query, id);
        System.err.println("deleted user qith id " + id);
    }

    @Override
    public void update(long id, String name, int age) {
        String query = "update `user` set name = ?, age = ? where id = ?";
        jdbcTemplate.update(query, name, age, id);
        System.err.println("updated user with id " + id);
    }
}
