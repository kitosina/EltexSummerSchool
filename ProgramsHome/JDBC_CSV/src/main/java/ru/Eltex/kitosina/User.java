package ru.Eltex.kitosina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class User implements CSV {
private Integer ID;
private String FIO;
private String Email;
private String Phone;
User(Integer ID){
    setID(ID);
}
protected void getDeveloperFile() throws IOException {
    Integer NumStr=1;
        String[] userStandartDat;
        String[] userData;
        BufferedReader buffDeveloper=new BufferedReader(new FileReader("C:\\Users\\kitos\\IdeaProjects\\JDBC_CSV\\src\\main\\resources\\developer.csv"));
        while(NumStr!=getID()){
            NumStr++;
            buffDeveloper.readLine();
        }//Поиск нужной строки по ID
        userData=(buffDeveloper.readLine()).split(":");//Разбили данные нужной строки на Данные User и Lang
        userStandartDat=userData[0].split(",");//Разбили строку User на нужные элементы
        setFIO(userStandartDat[1]);
        setEmail(userStandartDat[2]);
        setPhone(userStandartDat[3]);
        buffDeveloper.close();
}
    protected void getManagerFile() throws IOException {
        Integer NumStr=1;
            String[] userStandartDat;
            String[] userData;
            BufferedReader buffManager=new BufferedReader(new FileReader("C:\\Users\\kitos\\IdeaProjects\\JDBC_CSV\\src\\main\\resources\\manager.csv"));
            while(NumStr!=(ID)){
                NumStr++;
                buffManager.readLine();
            }//Поиск нужной строки по ID
            userData=(buffManager.readLine()).split(">");//Разбили данные нужной строки на Данные User и Lang
            userStandartDat=userData[0].split(",");//Разбили строку User на нужные элементы
            setFIO(userStandartDat[1]);
            setEmail(userStandartDat[2]);
            setPhone(userStandartDat[3]);
            buffManager.close();
    }
    protected Integer getID() {
        return ID;
    }
    protected void setID(Integer ID) {
        this.ID = ID;
    }
    protected String getFIO() {
        return FIO;
    }
    protected void setFIO(String FIO) {
        this.FIO = FIO;
    }
    protected String getEmail() {
        return Email;
    }
    protected void setEmail(String email) {
        Email = email;
    }
    protected String getPhone() {
        return Phone;
    }
    protected void setPhone(String phone) {
        Phone = phone;
    }
}
