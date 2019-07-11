package ru.Eltex.kitosina;


import java.io.*;
import java.util.ArrayList;

public class HeadClass {
    public static void main(String[] args)
    throws IOException {
        //Manager-------------------------------------------------------------------------------------------------------
        String[] items={"iphonka","ipadka","youPadka"};
        String[] cost={"30000","12329","9999"};
        Manager Man=new Manager((byte) 1,"Malinov","Malina@mail.ru","8-906-910-83-460",items,cost);
        Man.toCSV();
        Man.fromCSV();
    }
}
