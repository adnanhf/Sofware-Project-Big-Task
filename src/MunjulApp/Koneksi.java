package MunjulApp;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import javax.swing.JOptionPane;  
      
    public class Koneksi {  
      
        private Connection koneksi;  
      
        public Connection getKoneksi() {  
            return koneksi;  
        }  
      
        public void koneksiDatabase() { //<-- untuk koneksi ke database  
            // Cek Driver  
            try {  
                Class.forName("oracle.jdbc.driver.OracleDriver"); //<-- nama driver untuk koneksi ke MySQL  
      
                // Cek Database  
                try {  
                    String url, user, password;  
                    url = "jdbc:oracle:thin:@localhost:1521:XE"; //alamat DB  
                    user = "system";  
                    password = "k41vertr1g";  
                    koneksi = DriverManager.getConnection(url, user, password);  
                    koneksi.setSchema("MUNJULDELIVERY");
                    System.out.println("Koneksi Sukses");  
                } catch (SQLException se) {  
                    JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + se.getMessage());  
                    System.exit(0);  
                }  
            } catch (ClassNotFoundException cnfe) {  
                JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan! \n" + cnfe.getMessage());  
                System.exit(0);  
            }  
        }  
      
        public static void main(String[] kon) {  
            new Koneksi().koneksiDatabase();  
        }  
    } 