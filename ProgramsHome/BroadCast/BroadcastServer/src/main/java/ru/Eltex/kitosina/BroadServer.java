package ru.Eltex.kitosina;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class BroadServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8000);
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        while (true) {
            try {
                socket.receive (packet);
                System.out.println("Received from: " + packet.getAddress () + ":" +
                        packet.getPort ());
                String messageClient=new String(packet.getData());
                System.out.println(messageClient);
            } catch (IOException error) {
                error.getMessage();
            }
        }
    }
}
