import java.sql.*;

public class _03_InsertDataUsingJavaProgram {
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

            // 5. set the values
            pstmt.setString(1, "Priyanshu Gour");
            pstmt.setString(2, "Harda");

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
