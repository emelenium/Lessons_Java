package com.company.InetAddress;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Test5 {
    public static void main(String[] args) throws SocketException {
        //получает и выводит все сетевые интерфейсы
        Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
        while(interfaces.hasMoreElements())
        {
            NetworkInterface in = (NetworkInterface)interfaces.nextElement();
            System.out.println(in);
        }
    }
}
