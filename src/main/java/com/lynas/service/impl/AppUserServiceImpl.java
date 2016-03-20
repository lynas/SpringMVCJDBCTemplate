package com.lynas.service.impl;

import com.lynas.model.AppUser;
import com.lynas.model.AppUserRowMapper;
import com.lynas.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;


@Service(value = "appUserService")
public class AppUserServiceImpl implements AppUserService {


    @Autowired
    ApplicationContext applicationContext;
    private final static String SQL_FIND_BY_ID = "SELECT * from appuser WHERE id = ?";


    @Override
    public AppUser getUserByID(int id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate((DataSource) applicationContext.getBean("dataSource"));
        return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[]{id}, new AppUserRowMapper());
    }
}
