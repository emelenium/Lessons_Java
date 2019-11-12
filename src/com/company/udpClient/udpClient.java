package com.company.udpClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpClient {
    public static void main(String[] args) throws Exception {
        int i = 8;
        byte[] bytes = (i + "").getBytes();

        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetAddress, 9999);
        datagramSocket.send(datagramPacket);

        byte[] bytes1 = new byte[1024];
        DatagramPacket datagramPacket1 = new DatagramPacket();
        datagramSocket.receive(datagramPacket1);

        String str = new String((datagramPacket1.getData()));
        System.out.println("result is " + str);

    }
}
