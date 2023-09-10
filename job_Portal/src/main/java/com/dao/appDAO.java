package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Application;

public class appDAO {
    private Connection conn;

    public appDAO(Connection conn) {
        super();
        this.conn = conn;
    }

    public boolean addApplication(Application application) {
        boolean isSuccess = false;
        try {
        	String insertSql = "INSERT INTO job_application (name, email, phone, message) VALUES (?, ?, ?, ?)";
            
        	PreparedStatement ps = conn.prepareStatement(insertSql);
              
            ps.setString(1, application.getName());
            ps.setString(2, application.getEmail());
            ps.setString(3, application.getPhone());
            ps.setString(4, application.getMessage());

            int i = ps.executeUpdate();
            if (i == 1) {
                isSuccess = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}

