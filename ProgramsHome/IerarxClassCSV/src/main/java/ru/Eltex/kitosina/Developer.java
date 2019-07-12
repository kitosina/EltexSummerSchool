package ru.Eltex.kitosina;

import java.io.*;

public class Developer extends User implements CSV {
    String[] lang;
    Developer(Byte Id,String FIO, String Email, String Phone, String[] lang) {
        super(Id,FIO, Email, Phone);
        setLang(lang);
    }
    Developer(){
        super();
    }
    private void setLang(String[] lang){
        this.lang=lang;
    }
    private String[] getLang(){
        return this.lang;
    }
    private String getLangStroka(){
        StringBuilder Sb=new StringBuilder();
        for(int i=0;i<lang.length;i++){
            Sb.append(lang[i]).append(",");
        }
        return Sb.toString();
    }
    private String getStrokaUser(){
        StringBuilder Sb=new StringBuilder();
        Sb.append(getId()).append(",").append(getFIO()).append(",").append(getEmail()).append(",").append(getPhone()).append(":");
        return Sb.toString();
    }
    public String toString(){
     StringBuilder Sb=new StringBuilder();
     Sb.append(getId()).append(getFIO()).append(getEmail()).append(getPhone()).append(getLangStroka());
     return Sb.toString();
    }
    /*private StringBuilder getLangsStroka(){
        StringBuilder Sb=new StringBuilder();
        Sb.append(getLang());
        return Sb;
    }*/
    @Override
    public void toCSV() {
        try {
            FileWriter Manager=new FileWriter("Developer.csv",false);
            Manager.write(getStrokaUser()+getLangStroka());//+getLangsStroka());
            Manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void fromCSV() {
        String Data=":";
        String csvData=",";
        String Str;
        String[] userFullData;
        String[] userBitData;
        String[] langFullData;
        try {
            BufferedReader BuffR=new BufferedReader(new FileReader("Developer.csv"));
            Str=BuffR.readLine();
            userFullData=Str.split(Data);//Po : User Data and Langs
            userBitData=userFullData[0].split(csvData);
            super.setId(Byte.valueOf(userBitData[0]));
            super.setFIO(userBitData[1]);
            super.setEmail(userBitData[2]);
            super.setPhone(userBitData[3]);
            langFullData=userFullData[1].split(csvData);
            this.setLang(langFullData);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
