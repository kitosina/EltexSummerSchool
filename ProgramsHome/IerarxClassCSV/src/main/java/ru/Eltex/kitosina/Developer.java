package ru.Eltex.kitosina;

public class Developer extends User {
    String[] lang;
    Developer(String FIO, String Email, String Phone, Byte Id, String[] lang) {
        super(FIO, Email, Phone, Id);

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
    public String fromCSV(String str) {
        return null;
    }
}
