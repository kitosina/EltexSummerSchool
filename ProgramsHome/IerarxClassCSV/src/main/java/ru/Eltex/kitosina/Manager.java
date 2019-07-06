package ru.Eltex.kitosina;

public class Manager extends User {
    String Sales[];
    Manager(String FIO, String Email, String Phone, Byte Id,String Sales[]) {
        super(FIO, Email, Phone, Id);
        this.Sales=Sales;
    }
}
