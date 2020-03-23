package com.company.udpClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udpServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket2 = new DatagramSocket(9999);//создание сокета
        byte[] bytes1 = new byte[1024];//массив для приёма данных в датаграмме
        DatagramPacket datagramPacket2 = new DatagramPacket(bytes1, bytes1.length);//датаграмма для приема данных
        datagramSocket2.receive(datagramPacket2);//чтение входящих пакетов
        String str = new String(datagramPacket2.getData(), 0, datagramPacket2.getLength());
        System.out.println(str);
        int num = Integer.parseInt(str.trim());
        int result = num * num;
        byte[] bytes2 = String.valueOf(result).getBytes();//массив для отправки ответа в датаграмме
        InetAddress inetAddress = InetAddress.getLocalHost();//адрес локального хоста
        DatagramPacket datagramPacket3 = new DatagramPacket(bytes2, bytes2.length, inetAddress, datagramPacket2.getPort());//создание и подготовка исходящей ответной датаграммы, порт берется из входящей датаграммы
        System.out.println("порт =" + datagramPacket2.getPort());
        datagramSocket2.send(datagramPacket3);//отправка ответа
    }
}
