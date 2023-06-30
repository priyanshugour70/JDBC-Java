public class _06_InseringImageToDBLargeImage {
    // in blob datatype only 64kb image can be stored
    // to store large image we use mediumblob datatype
    // mediumblob can store upto 16mb image
    // to store more than 16mb image we use longblob datatype
    // longblob can store upto 4gb image
    // to store large image we use setBinaryStream() method
    // setBinaryStream() method takes 3 parameters
    // 1. index
    // 2. FileInputStream object
    // 3. length of the image
    // FileInputStream fin = new FileInputStream(new File("Image1.jpg"));
    // pstmt.setBinaryStream(1, fin, fin.available());
    // fin.close();
}
