import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi_mysql {
    Connection koneksi;
    public Connection getConnection(){
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_barang","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak terhubung ke DATABASE!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        return koneksi;
    }
}
