package ru.Eltex.kitosina;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class BroadClient {
    private static DatagramSocket socket = null;
    public static void main(String[] args) throws IOException {
        broadcast("Hello-Server", InetAddress.getByName("255.255.255.255"));
    }
    public static void broadcast(
            String broadcastMessage, InetAddress address) throws IOException {
        socket = new DatagramSocket();
        socket.setBroadcast(true);
        byte[] buffer = broadcastMessage.getBytes();
        DatagramPacket packet
                = new DatagramPacket(buffer, buffer.length, address, 8000);
        socket.send(packet);
        socket.close();
    }
}

