package ru.Eltex.kitosina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class Manager extends User {
    final String URL = "jdbc:mysql://localhost:3306/jdbc_csv";
    final String user = "root";
    final String password = "12345";
    private Integer ManagerIdStr=1;
    private ArrayList<String> Cost = new ArrayList<>();//Храним Цену товара
    private ArrayList<String> Item = new ArrayList<>();//Храним Название товара

    Manager(Integer ID) {
        super(ID);
    }
    public String toString(){
        StringBuilder BuffUser=new StringBuilder();
        StringBuilder BuffItems=new StringBuilder();
        BuffUser.append(getID()).append(",").append(getFIO()).append(",").append(getEmail()).append(",").append(getPhone()).append("\n");
        for(Integer i=0;i<Cost.size();i++){
            BuffItems.append(Cost.get(i)).append(":").append(Item.get((i))).append("\n");
        }
        BuffUser.append(BuffItems);
        return BuffUser.toString();
    }
    @Override
    public void fromCSV() throws IOException {
        Integer NumStr = 1;
        String[] userData;
        String[] managerDat;
        getManagerFile();
            BufferedReader buffManager = new BufferedReader(new FileReader("C:\\Users\\kitos\\IdeaProjects\\JDBC_CSV\\src\\main\\resources\\manager.csv"));
            while (NumStr !=(super.getID())) {
                NumStr++;
                buffManager.readLine();
            }
            userData = (buffManager.readLine()).split(">");
            managerDat = userData[1].split(",");
            for (String managerdat : managerDat) {
                String[] costItem = managerdat.split(":");
                Item.add(costItem[0]);
                Cost.add(costItem[1]);
            }//Разбили строку Manager на Cost и Items-Заполняем ArrayLists
    }
    @Override
    public void toDateBase() throws SQLException {
        String tablesManager = "insert into manager (FIO,Email,Phone,CostItems_id) values (?,?,?,?)";
        String tablesCostItems = "insert into costitems (Cost,Items,IdManager) values (?,?,?)";
        Connection connection = DriverManager.getConnection(URL, user, password);
        Statement statementManager = connection.createStatement();
        ResultSet resultSetManager = statementManager.executeQuery("select id from manager");
        while (resultSetManager.next()) {
            ManagerIdStr = resultSetManager.getInt("id");
            ManagerIdStr++;
        }//Нумеруем CostItems_id, отталкиваясь от последнего ManagerID
        PreparedStatement preparedStatementManagerTables = connection.prepareStatement(tablesManager);
        preparedStatementManagerTables.setString(1, super.getFIO());
        preparedStatementManagerTables.setString(2, super.getEmail());
        preparedStatementManagerTables.setString(3, super.getPhone());
        preparedStatementManagerTables.setInt(4, ManagerIdStr);
        preparedStatementManagerTables.executeUpdate();//Заполнили таблицу manager
        for (int i = 0; i < Cost.size(); i++) {
            PreparedStatement preparedStatementCostItemsTables = connection.prepareStatement(tablesCostItems);
            preparedStatementCostItemsTables.setString(1, Cost.get(i));
            preparedStatementCostItemsTables.setString(2, Item.get(i));
            preparedStatementCostItemsTables.setInt(3, ManagerIdStr);
            preparedStatementCostItemsTables.executeUpdate();//Заполнили таблицу Costitems
        }
    }
}
