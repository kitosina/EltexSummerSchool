package ru.Eltex.kitosina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class Developer extends User {
    final String URL="jdbc:mysql://localhost:3306/jdbc_csv";
    final String user="root";
    final String password="12345";
    private Integer DeveloperIdStr=1;
    private ArrayList<String> Lang=new ArrayList<>();//Храним языки и ID
    Developer(Integer ID) {
        super(ID);
    }
    public String toString(){
        StringBuilder BuffUser=new StringBuilder();
        StringBuilder BuffLangsId=new StringBuilder();
        BuffUser.append(getID()).append(",").append(getFIO()).append(",").append(getEmail()).append(",").append(getPhone()).append("\n");
        for(String langId: Lang){
            BuffLangsId.append(langId).append("\n");
        }
        BuffUser.append(BuffLangsId);
        return BuffUser.toString();
    }
    @Override
    public void fromCSV() throws IOException {
        getDeveloperFile();
        Integer NumStr=1;
        String[] LangsStr;
        String[] userData;
            BufferedReader buffDeveloper = new BufferedReader(new FileReader("C:\\Users\\kitos\\IdeaProjects\\JDBC_CSV\\src\\main\\resources\\developer.csv"));
            while(NumStr!=(super.getID())){
                NumStr++;
                buffDeveloper.readLine();
            }//Поиск нужной строки по ID
            userData=(buffDeveloper.readLine()).split(":");//Разбили данные нужной строки на Данные User и Lang
            LangsStr=userData[1].split(",");//Разделили языки
            for(String lang: LangsStr){
                Lang.add(lang);
            }
    }
    @Override
    public void toDateBase() throws SQLException {
        String tablesDeveloper="insert into developer (FIO,Email,Phone,Lang_id) values (?,?,?,?)";
        String tablesLang="insert into lang (Lang,DeveloperID) values (?,?)";
            Connection connection=DriverManager.getConnection(URL,user,password);
            Statement statementDeveloper=connection.createStatement();
            ResultSet resultSetDeveloper=statementDeveloper.executeQuery("select DeveloperID from developer");
            while(resultSetDeveloper.next()){
                DeveloperIdStr = resultSetDeveloper.getInt("DeveloperID");
                DeveloperIdStr++;
            }//Нумеруем Lang_id, отталкиваясь от последнего DeveloperID
            PreparedStatement preparedStatementDeveloperTables=connection.prepareStatement(tablesDeveloper);
            preparedStatementDeveloperTables.setString(1,super.getFIO());
            preparedStatementDeveloperTables.setString(2,super.getEmail());
            preparedStatementDeveloperTables.setString(3,super.getPhone());
            preparedStatementDeveloperTables.setInt(4,DeveloperIdStr);
            preparedStatementDeveloperTables.executeUpdate();//Заполнили таблицу developer
            for(int i=0;i<Lang.size();i++) {
                PreparedStatement preparedStatementLangTables = connection.prepareStatement(tablesLang);
                preparedStatementLangTables.setString(1, Lang.get(i));
                preparedStatementLangTables.setInt(2, DeveloperIdStr);
                preparedStatementLangTables.executeUpdate();//Заполнили таблицу Lang
            }
    }
}
