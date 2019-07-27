package ru.Eltex.kitosina;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class Manager extends User{
    Integer id;
    final String URL="jdbc:mysql://localhost:3306/jdbc_csv";
    final String user="root";
    final String password="12345";
    private ArrayList<String> Cost=new ArrayList<>();//Храним Цену товара
    private ArrayList<String> Item=new ArrayList<>();//Храним Название товара
    Manager(Integer ID) {
        super(ID);
    }
    @Override
    public void fromCSV(){
        Integer NumStr=1;
        String[] userData;
        String[] managerDat;
        getManagerFile();
        try {
            BufferedReader buffManager=new BufferedReader(new FileReader("C:\\Users\\kitos\\IdeaProjects\\JDBC_CSV\\src\\main\\resources\\manager.csv"));
            while(NumStr!=(super.getID())){
                NumStr++;
                buffManager.readLine();
            }
            userData=(buffManager.readLine()).split(">");
            managerDat=userData[1].split(",");
            for(String managerdat: managerDat){
                String[] costItem=managerdat.split(":");
                Item.add(costItem[0]);
                Cost.add(costItem[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void toDateBase() {

    }
}
