package ru.Eltex.kitosina;

import java.io.*;
import java.util.ArrayList;

public class Manager extends User implements CSV {
    private ArrayList<sales> Sales=new ArrayList<>();
    private ArrayList<String> Items = new ArrayList<>();
    private ArrayList<String> Cost = new ArrayList<>();
    private ArrayList<String> Items_cost=new ArrayList<>();
    Manager(Byte Id, String FIO, String Email, String Phone, String[] items, String[] cost) {
        super(Id,FIO, Email, Phone);
        setSales(items,cost);
    }
    Manager(){
        super();
    }
    public String toString(){
        StringBuilder Sb=new StringBuilder();
        Sb.append(getId()).append(getFIO()).append(getEmail()).append(getPhone()).append(getSalesStroka());//append(Sal.getItems()).append(':').append(Sal.getCost());
        return Sb.toString();
    }
    private void setSales(String[] items, String[] cost) {
        if (items.length != cost.length) {
            System.out.println("Error Otnoshenie cost/items not =");
        }
        for (int i = 0; i < cost.length; i++) {
            Items.add(items[i]);
            Cost.add(cost[i]);
            StringBuilder Str=new StringBuilder();
            Str.append(items[i]).append(":").append(cost[i]).append('\n');
            Items_cost.add(String.valueOf(Str));
        }
        Sales.add(new sales(Items, Cost));
    }
    private String getSalesStroka(){
        StringBuilder Buff=new StringBuilder();
        sales Sal=new sales(Items,Cost);
        Buff.append(Sal.getItems()).append(':').append(Sal.getCost());
        return Buff.toString();
    }
    private String getUserStroka(){
        StringBuilder Buff=new StringBuilder();
        Buff.append(getId()).append(',').append(getFIO()).append(',').append(getEmail()).append(',').append(getPhone()).append('>');
        return Buff.toString();
    }
    @Override
    public void toCSV() {
        try {
            FileWriter Manager=new FileWriter("Manager.csv",false);
            Manager.write(getUserStroka()+getSalesStroka());
            Manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void fromCSV() {
        String[] StrokaData;
        String[] userData;
        String[] salesData;
        String[] DeleterItem;
        //String[] ItemsDataEnd;
        String[] DeleterCost;
        //String[] CostsDataEnd;
        String dateSplitBy=">";
        String csvSplitBy=",";
        String salesSplitBy=":";
        String Deleter="\\[";
        String DeleterEnd="\\]";
        try {
            BufferedReader BuffR = new BufferedReader(new FileReader("Manager.csv"));
            String Str = BuffR.readLine();//Schet Str
            StrokaData=Str.split(dateSplitBy);
            userData=StrokaData[0].split(csvSplitBy);
            super.setId(Byte.valueOf(userData[0]));
            super.setFIO(userData[1]);
            super.setEmail(userData[2]);
            super.setPhone(userData[3]);
            //----------------------------------------------------
            salesData=StrokaData[1].split(salesSplitBy);//Razbit :
            DeleterItem=salesData[0].split(Deleter);
            //DeleterItem[0].substring(1);
            //ItemsDataEnd=DeleterItem[1].split(DeleterEnd);//One parametr[0]
            //----------------------------------------------------
            DeleterCost=salesData[1].split(Deleter);
            //CostsDataEnd=DeleterCost[1].split(DeleterEnd);//Two parametr[0]
            setSales(DeleterItem[1].split(DeleterEnd),DeleterCost[1].split(DeleterEnd));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
