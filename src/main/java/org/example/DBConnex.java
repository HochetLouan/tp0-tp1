package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnex {
    private static final String URL = "jdbc:mysql://localhost:3306/notes_lh";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
