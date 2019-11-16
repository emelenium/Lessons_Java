package com.company.udpClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet6Address;
import java.net.InetAddress;

public class udpClient {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();//создание датаграммного сокета UDP протокола

        int i = 2338;
        byte[] b = String.valueOf(i).getBytes();//массив байтов для отправки пакета (датаграммы)
        InetAddress ia = InetAddress.getLocalHost();//ip адресс куда отправляем датаграмму
        System.out.println(b.length);
        DatagramPacket dp = new DatagramPacket(b, b.length, ia, 9999);//создание датаграммы
        ds.send(dp);//непосредственно отправка созданной датаграммы

        byte[] b1 = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);//создание датаграммы для чтения данных из сокета
        ds.receive(dp1);//чтение из сокета ds данных в датаграмму dp1
        System.out.println("порт =" + dp1.getPort());
        String str = new String(dp1.getData(), 0, dp1.getLength());//преобразование в строку данных из датаграммы
        System.out.println("result is " + str);

    }
}
