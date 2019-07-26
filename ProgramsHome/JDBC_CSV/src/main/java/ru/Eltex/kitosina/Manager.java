package ru.Eltex.kitosina;

import java.sql.*;

public class Manager implements CSV{
    Integer id;
    final String URL="jdbc:mysql://localhost:3306/jdbc_csv";
    final String user="root";
    final String password="12345";
    Manager(Integer id){
        this.id=id;
    }
    public void fromCSV() {
        try {
            Connection connection = DriverManager.getConnection(URL,user,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from manager");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String toCSV(String str) {
        return null;
    }
}
