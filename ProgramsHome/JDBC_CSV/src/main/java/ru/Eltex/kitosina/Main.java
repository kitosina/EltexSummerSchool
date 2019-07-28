package ru.Eltex.kitosina;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Инструкция:
         * 1)Создание обьекта Manager или Developer
         * 2)Вызов метода fromCSV()
         * 3)Вызов метода toDateBase()
         * 4)Для вывода информации метод toString()
         */
        Developer dev1=new Developer(2);
        Developer dev2=new Developer(3);
        Developer dev3=new Developer(5);
        dev1.fromCSV();
        dev2.fromCSV();
        dev3.fromCSV();
        dev1.toDateBase();
        dev2.toDateBase();
        dev3.toDateBase();
        Manager man1=new Manager(1);
        Manager man2=new Manager(2);
        Manager man3=new Manager(3);
        man1.fromCSV();
        man2.fromCSV();
        man3.fromCSV();
        man1.toDateBase();
        man2.toDateBase();
        man3.toDateBase();
    }
}
