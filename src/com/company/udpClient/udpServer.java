package com.company.udpClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket2 = new DatagramSocket(9999);
        byte[] bytes1 = new byte[1024];
        DatagramPacket datagramPacket2 = new DatagramPacket(bytes1, bytes1.length);
        datagramSocket2.receive(datagramPacket2);
        String str = new String(datagramPacket2.getData());
        int num = Integer.parseInt(str.trim());
        int result = num*num;
        byte[] bytes2 =(result+"").getBytes();
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket datagramPacket3 = new DatagramPacket(bytes2, bytes2.length,inetAddress,datagramPacket2.getPort());
        datagramSocket2.send(datagramPacket3);
    }
}
