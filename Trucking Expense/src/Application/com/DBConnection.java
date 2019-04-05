package Application.com;

import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "12345";
    private static Connection connection;

    public static Connection getConnection() throws SQLException
    {
        try
        {
            connection = DriverManager.getConnection(url, username, password);
        } catch(SQLException ex)
        {
            throw new RuntimeException("Error connecting to the database...", ex);
        }
        return connection;

    }


    public Statement createStatement() throws SQLException {
      return connection.createStatement();
    }
}
