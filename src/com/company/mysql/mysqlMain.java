package com.company.mysql;

import javax.xml.parsers.ParserConfigurationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlMain {
public static void main(String[] args) throws ParserConfigurationException, ClassNotFoundException, SQLException {
    String userName = "rc";
    String password = "tu@zvc2A11i098";
    String connectUrl = "jdbc:mysql://192.168.115.128:3306/test";
    Class.forName("com.mysql.cj.jdbc.Driver");
    try(Connection connection = DriverManager.getConnection(connectUrl,userName,password)) {
        System.out.println("We're connected");
    }
}
}
