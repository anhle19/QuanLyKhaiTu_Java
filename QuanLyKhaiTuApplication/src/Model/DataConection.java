
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataConection {
    public static final String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyKhaiTu;user=sa;password=12345;";

    public Connection connect(){
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(connectionUrl);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
    
}
