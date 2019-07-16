package ru.Eltex.kitosina;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerM {
    public static void main(String[] args){
        try(ServerSocket SSoc=new ServerSocket(3385)){
            Socket client=SSoc.accept();
            InputStream inStream=client.getInputStream();
            OutputStream outStream=client.getOutputStream();
            Scanner in=new Scanner(inStream);
            PrintWriter out=new PrintWriter(outStream);
            out.write("Hello Client");
            out.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
