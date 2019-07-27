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
    @Override
    public void fromCSV() {

    }
    @Override
    public void toDateBase() {

    }
}
