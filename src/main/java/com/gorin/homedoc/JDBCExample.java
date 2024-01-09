package com.gorin.homedoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

    public static final String URl = "jdbc:mysql://localhost:3306/Adminka";
    public static final String USER = "root";
    public static final String PASSWORD = "BagsBunny7";

    private Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URl, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void getAllUsers() {
        String sql = "SELECT id, login, pass, stat FROM Login";

    }

}
