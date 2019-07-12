package ru.Eltex.kitosina;


import java.io.*;
import java.util.ArrayList;

public class HeadClass {
    public static void main(String[] args)
    throws IOException {
        //Manager-------------------------------------------------------------------------------------------------------
        String[] items={"iphonka","ipadka","youPadka"};
        String[] cost={"30000","12329","9999"};
        String[] lang={"Java","Cu"};
        Manager Man=new Manager((byte) 1,"Malinov","Malina@mail.ru","8-906-910-83-460",items,cost);
        Man.toCSV();
        Manager Rman=new Manager();
        Rman.fromCSV();
        System.out.println(Rman.toString());
        Developer dev=new Developer((byte)1,"Garik","Gar@y.ru","8-909-520-32-22",lang);
        dev.toCSV();
        Developer dev2=new Developer();
        dev2.fromCSV();
        System.out.println(dev2.toString());
    }
}
