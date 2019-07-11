package ru.Eltex.kitosina;

import java.io.*;
import java.nio.CharBuffer;
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
        Buff.append(getId()).append(',').append(getFIO()).append(',').append(getEmail()).append(',').append(getPhone()).append('>').append(Sal.getItems()).append(':').append(Sal.getCost());
        return Buff.toString();
    }
    @Override
    public void toCSV() {
        try {
            FileWriter Manager=new FileWriter("Manager.csv",false);
            Manager.write(getSalesStroka());
            Manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void fromCSV() {
        String[] StrokaBit2;
        String FullStr = null;
        try {
            BufferedReader BuffR = new BufferedReader(new FileReader("Manager.csv"));
            BuffR.readLine();
            String FullStroka= BuffR.toString();
            String[] StrokaBit1=FullStroka.split(",");
            /*Можем писать id Fio Email, Phone еще связан с items and cost*/
            super.setId(Byte.valueOf(StrokaBit1[0]));//Id
            super.setFIO(StrokaBit1[1]);
            super.setEmail(StrokaBit1[2]);
            StrokaBit2=StrokaBit1[3].split(">");
            super.setPhone(StrokaBit2[0]);//Перевести все на ArrayList
            for(int i=0;i<Items_cost.size();i++){
                FullStr=Items_cost.get(i)+FullStr;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
