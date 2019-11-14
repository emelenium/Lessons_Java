package com.company;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Main {

    public static void main(String[] args) {
        Socket socket = new Socket();
        SocketAddress socketAddress = new InetSocketAddress("india.colorado.edu",13);

        //        socket.connect(new InetSocketAddress("india.colorado.edu",13));


    }
}
