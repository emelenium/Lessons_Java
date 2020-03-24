package com.company.InetAddress;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.net.URL;

public class TestUr11 {
    public static void main(String[] args) {
        try{
            //показывает информацию по ссылке
        URL url = new URL("https://www.folknet.in/ss2008/html/index.php");

            System.out.println("Protocol :"+url.getProtocol());
            System.out.println("host name :"+url.getHost());
            System.out.println("Port :"+url.getPort());
            System.out.println("File :"+url.getFile());
            System.out.println("Path is :"+url.getPath());
            System.out.println("Refrence :"+url.getRef());


        }catch (MalformedParameterizedTypeException | MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
