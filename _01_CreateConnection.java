
// Progrma fo jdbc 1 Program .. 
import java.sql.*;

class _01_CreateConnection {

    public static void main(String args[]) {

        try {

            // 1. load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. create the connection
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Harda@20p";
            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection is opened");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}