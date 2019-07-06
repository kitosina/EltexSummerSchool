package ru.Eltex.kitosina;

public class Developer extends User {
    String[] lang;
    Developer(String FIO, String Email, String Phone, Byte Id, String[] lang) {
        super(FIO, Email, Phone, Id);
        this.lang=lang;
    }
}
