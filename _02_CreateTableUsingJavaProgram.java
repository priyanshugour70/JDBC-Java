import java.sql.Connection;
import java.sql.*;

public class _02_CreateTableUsingJavaProgram {
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

            // 3. create the query
            String query = "create table student(sId int(10) primary key auto_increment, sName varchar(200) not null , sCity varchar(400))";

            // 4. execute the query
            Statement stmt = con.createStatement();

            stmt.executeUpdate(query);

            System.out.println("Table created successfully... ");

            // 5. close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
