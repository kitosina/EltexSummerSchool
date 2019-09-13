package ru.Eltex.kitosina;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpClient{
    public static void main(String[] args) {
        try {
            byte[] data = "Hello".getBytes();
            InetAddress addr = InetAddress.getByName("127.0.0.1");
            DatagramPacket pack =
                    new DatagramPacket(data, data.length, addr, 8000);
            DatagramSocket ds = new DatagramSocket();
            ds.send(pack);
            ds.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
