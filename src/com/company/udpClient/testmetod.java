package com.company.udpClient;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class testmetod {
    public static Inet6Address getInet6AddressByName(String host) throws Exception, SecurityException {
        for (InetAddress addr : InetAddress.getAllByName(host)) {
            if (addr instanceof Inet6Address)
                return (Inet6Address) addr;
        }
        throw new Exception("No IPv6 address found for " + host);
    }

    public static void main(String[] args) throws Exception {
        String host = "google.com";//"localhost";
        InetAddress adr = InetAddress.getByAddress(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});//Создает объект InetAddress с указанным IP4 или IP6 адресом
        InetAddress adr2 =InetAddress.getByName(host);
        System.out.println(adr2.getCanonicalHostName());//возвращает каноническое имя компьютера
        System.out.println(adr2.getHostName());//возвращает имя хоста  инициализированного объекта InetAddress
        System.out.println(adr2.getHostAddress());
        System.out.println(adr2.isMCGlobal());

        for (InetAddress adr3 : InetAddress.getAllByName(host)){
            System.out.println("getAllByName:  "+adr3.getHostAddress());


        }


      // System.out.println(getInet6AddressByName(host));


    }

}

