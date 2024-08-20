package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class KoneksiDb {
    public static Connection conn;
    public static Statement stm;

    public Connection Config() {
        try {
            // Corrected URL with jdbc:mysql and port number
            String url = "jdbc:mysql://localhost:3306/loundry_db";
            String user = "root";
            String pass = "";

            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            System.out.println("Koneksi Berhasil");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi tidak berhasil " + e.getMessage());
        }
        
        return conn;
    }
}
