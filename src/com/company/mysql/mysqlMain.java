package com.company.mysql;

import javax.xml.parsers.ParserConfigurationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlMain {
public static void main(String[] args) throws ParserConfigurationException, ClassNotFoundException, SQLException {
    String userName = "rc";
    String password = "tu@zvc2A11i098";
    String connectUrl = "jdbc:mysql://192.168.115.128:3306/test";
   // Class.forName("com.mysql.cj.jdbc.Driver");
    //Когда метод getConnection вызывается, DriverManager попытается найти подходящий драйвер из числа тех,
    // которые загружены при инициализации, и тех, которые загружены явно, используя тот же загрузчик классов,
    // что и текущий апплет или приложение.
        try(Connection connection = DriverManager.getConnection(connectUrl,userName,password);
        Statement statement = connection.createStatement()) {
        System.out.println("We're connected");
        statement.executeUpdate("DROP TABLE Books");
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS Books (id MEDIUMINT NOT NULL  AUTO_INCREMENT,name CHAR (30) NOT NULL, PRIMARY_KEY(id));");
        statement.executeUpdate("INSERT INTO Books (name) values('Inferno')");
            statement.executeUpdate("INSERT INTO Books SET name ='Inferno'");
    }
}
}
