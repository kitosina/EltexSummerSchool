package ru.Eltex.kitosina;

import java.io.*;
import java.util.Scanner;

public class HeadClass {
    public static void main(String[] args)
    throws IOException {
        //Number Blok one-Manager
        Scanner sc1=new Scanner(System.in);
        //File Manager=new File("Manager.txt");
            FileWriter F1=new FileWriter("Manager.txt",true);
            System.out.println("Vvedite (ID;FIO;Email;Phone;Lang1,Lang2...");
            F1.append("\n");
            String Str=sc1.nextLine();
            F1.write(Str);
            F1.close();
    }
}
