package ru.Eltex.kitosina;

import org.w3c.dom.NodeList;

public class UserData {
    private String User;
    private String Name;
    private String Age;
    private String Lang;
    public UserData(String user, String name, String age, String lang) {
        this.User = user;
        this.Name = name;
        this.Age = age;
        this.Lang = lang;
    }
    public String toString(){
        return User+"\n"+Name+"\n"+Age+"\n"+Lang;
    }
}
