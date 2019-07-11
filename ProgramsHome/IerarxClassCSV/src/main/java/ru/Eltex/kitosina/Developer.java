package ru.Eltex.kitosina;

import java.io.*;
import java.util.ArrayList;

public class Developer extends User implements CSV {
    String[] lang;
    Developer(Byte Id,String FIO, String Email, String Phone, String[] lang) {
        super(Id,FIO, Email, Phone);
        setLang(lang);
    }
    private void setLang(String[] lang){
        this.lang=lang;
    }
    public String[] getLang(){
        return lang;
    }
    @Override
    public void toCSV() {
    }
    @Override
    public void fromCSV() {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader("nnn"));
            rd.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
