package projekminimarket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class KoneksiDB {

    public Connection getConnection() {

        String user = "dipayana";
        String pass = "1969vx8";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
        Connection koneksi = null;
        try {
            koneksi = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", user, pass);
        } catch (SQLException e) {
            e.getMessage();
        }
        return koneksi;
    }

}
