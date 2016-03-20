package com.lynas.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by LynAs on 20-Mar-16
 */
public class AppUserRowMapper implements RowMapper<AppUser> {
    @Override
    public AppUser mapRow(ResultSet resultSet, int currentRow) throws SQLException {
        AppUser customer = new AppUser();
        customer.setId(resultSet.getInt("id"));
        customer.setUserName(resultSet.getString("userName"));
        customer.setPassword(resultSet.getString("password"));
        return customer;
    }
}
