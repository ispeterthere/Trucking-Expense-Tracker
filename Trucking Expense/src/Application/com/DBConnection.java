package Application.com;

import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "12345";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static Connection connection;

    public static Connection getConnection() throws SQLException
    {
        try {
            Class.forName(driverName);
            try
            {
                connection = DriverManager.getConnection(url, username, password);
            } catch(SQLException ex)
            {
                throw new RuntimeException("Error connecting to the database...", ex);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;

    }






}
