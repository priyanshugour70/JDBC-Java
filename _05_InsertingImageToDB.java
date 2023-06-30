import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class _05_InsertingImageToDB {
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
            String query = "insert into images(pic) values(?)";

            // 4. create the prepared statement
            PreparedStatement pstmt = con.prepareStatement(query);

            // Inserting image
            FileInputStream fin = new FileInputStream(
                    new File("Image.jpg"));

            // 5. set the Image
            pstmt.setBinaryStream(1, fin, fin.available());

            // 6. execute the query
            pstmt.executeUpdate();

            System.out.println("Image inserted successfully");

            // 7. close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
