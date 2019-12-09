package com.company.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    public static void main(String[] args) {


        try {
            //Displaying host ip address (показывает ip адрес хоста)
            InetAddress host = InetAddress.getByName("wwww.yahoo.com");
            System.out.println("Host ip Address is :" + host.getHostAddress());

            //Displaying host Name from ip address (показывает имя хоста по его ip адресу)
            InetAddress host1 = InetAddress.getByName("212.82.100.151");
        System.out.println("Host name for given ip is : "+host1.getHostName());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
