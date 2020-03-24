package com.company.InetAddress;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Test5 {
    public static void main(String[] args) throws SocketException {
        //получает и выводит все сетевые интерфейсы
        try {
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            System.setOut(new PrintStream(new FileOutputStream("OutPut.txt")));
            while (interfaces.hasMoreElements())
                {
                NetworkInterface in = (NetworkInterface) interfaces.nextElement();
                System.out.println(in);
                }

        }catch (Exception e){e.printStackTrace();}
    }
}
