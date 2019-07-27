package ru.Eltex.kitosina;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Developer dev=new Developer(3);
        dev.fromCSV();
        System.out.println(dev.toStringDeveloper());
        dev.toDateBase();
    }
}
