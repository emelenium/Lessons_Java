package com.company.udpClient;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class testmetod {
    public static void main(String[] args) throws Exception {
        //     InetAddress[] addresses = InetAddress.getAllByName("localhost");
        //     Inet6Address add6 = null;
        //     for (InetAddress add : addresses) {
        //         if (add instanceof Inet6Address) {
        //             add6 = add;
        //             break;
        //         }
        //     }
        //     if (add6 == null)
        //         throw new RuntimeException("no IPv6 local address found!");
        //     InetSocketAddress sa = new InetSocketAddress(add6, 9999);
       String host = "facebook.com";
       InetAddress[] inAdd = Inet6Address.getAllByName("localhost");

        Inet6Address add6 = null;
       for (InetAddress ia : inAdd) {
   //        System.out.println(ia.getCanonicalHostName());
        System.out.println(ia.getHostAddress());
        }
        InetAddress ina = Inet6Address.getLocalHost();
        System.out.println(ina.getCanonicalHostName());
        System.out.println(ina.getHostAddress());
    }
}
