package ru.Eltex.kitosina;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
        public static void main(String[] args){
            try {
                Socket client=new Socket("127.0.0.1",8000);
                Scanner sc=new Scanner(System.in);
                BufferedWriter out=new BufferedWriter(
                        new OutputStreamWriter(
                                client.getOutputStream()));
                BufferedReader in=new BufferedReader(
                        new InputStreamReader(
                                client.getInputStream()));
                System.out.println("Vvedite Chislo: ");
                for(Integer i=0;i<8;i++){
                    Integer Chislo=sc.nextInt();
                    out.write(Chislo);
                    //out.newLine();
                    out.flush();
                    String smsHod=in.readLine();
                    System.out.println(smsHod);
                    if (smsHod=="Bingoo!!!") break;
                }
                out.close();
                in.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
