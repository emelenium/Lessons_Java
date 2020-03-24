package com.company.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test2 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("127.0.0.1");
            if (address.isAnyLocalAddress()) System.out.println(address+" is wildcard address");
            else if (address.isLoopbackAddress()) System.out.println(address+" is a loopback address");
            else if (address.isLinkLocalAddress()) System.out.println(address+" is a link-local address");
            else if (address.isSiteLocalAddress()) System.out.println(address+" is site local address");
            else System.out.println(address+" is global address");
        }catch (UnknownHostException e){e.printStackTrace();}
    }
}
