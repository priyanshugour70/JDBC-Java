import java.sql.*;
import java.io.*;

public class _04_InsertDataDynamicInput {
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
            String query = "insert into student(sName, sCity) values(?, ?)";

            // 4. create the prepared statement
            PreparedStatement pstmt = con.prepareStatement(query);

            // Dynamic Input..
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the name of the student : ");
            String name = br.readLine();

            System.out.print("Enter the city of the student : ");
            String city = br.readLine();

            // 5. set the values
            pstmt.setString(1, name);
            pstmt.setString(2, city);

            // 6. execute the query
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully");

            // 7. close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
