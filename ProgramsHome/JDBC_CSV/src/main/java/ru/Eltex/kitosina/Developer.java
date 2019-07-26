package ru.Eltex.kitosina;

import java.sql.*;
import java.util.ArrayList;

public class Developer extends User {
    final String URL="jdbc:mysql://localhost:3306/jdbc_csv";
    final String user="root";
    final String password="12345";
    public void fromCSV() {
        try (Connection connection = DriverManager.getConnection(URL,user,password);){

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String toCSV(String str) {
        return null;
    }
}
