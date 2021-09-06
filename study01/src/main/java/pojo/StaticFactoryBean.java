package pojo;

import java.sql.Connection;
import java.sql.DriverManager;

public class StaticFactoryBean  {
    public static Connection getConn() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vhr?useSSL=false", "root", "root");
        return connection;
    }
}
