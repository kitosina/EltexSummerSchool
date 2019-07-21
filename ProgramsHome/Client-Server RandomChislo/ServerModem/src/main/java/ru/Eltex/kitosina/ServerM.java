package ru.Eltex.kitosina;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerM {
    public static void main(String[] args) {
        Integer a = 0, b = 100;
        Integer random_number = a + (int) (Math.random() * b);
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket client = serverSocket.accept();
            BufferedWriter out=new BufferedWriter(
                    new OutputStreamWriter(
                            client.getOutputStream()));
            BufferedReader in=new BufferedReader(
                    new InputStreamReader(
                            client.getInputStream()));
            System.out.println(random_number);
            for(Integer i=0;i<8;i++){
                Integer Chislo=in.read();
                    if (Chislo > random_number) {
                        if (i==7){
                            out.write("Game Over: Itog="+random_number.toString());
                            out.newLine();
                            out.flush();
                        } else {
                            out.write("Vvedite Chislo MIN: ");
                            out.newLine();
                            out.flush();
                        }
                    }
                    if (Chislo < random_number) {
                        if (i==7){
                            out.write("Game Over: Itog="+random_number.toString());
                            out.newLine();
                            out.flush();
                        } else {
                            out.write("Vvedite Chislo MAX: ");
                            out.newLine();
                            out.flush();
                        }
                    }
                    if (Chislo == random_number) {
                        out.write("Bingoo!!!");
                        out.newLine();
                        out.flush();
                        break;
                    }
            }
            out.close();
            in.close();
            client.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
