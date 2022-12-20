package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseConnection {
    static Connection connection=null;
    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        String db="searchaccio";
        String user="root";
        String pwd="shweta1507";
        return getConnection(db,user,pwd);
    }
    private static Connection getConnection(String db,String user,String pwd){
        try{
//            Class.forName("com.mysql.cj.jdbc.driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+db+"?user="+user+"&password="+pwd);
        }
        catch(Exception exception){
            exception.printStackTrace();

        }
        return connection;
    }
}
