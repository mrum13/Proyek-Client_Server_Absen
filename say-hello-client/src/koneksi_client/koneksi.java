package koneksi_client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import koneksi_client.ip_form;

public class koneksi {
    public static ip_form gui_ip= new ip_form();
    
    
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://'"+gui_ip.et_ip.getText()+"'/proyek-fix"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);    
            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
//            System.err.println(gui_ip.et_ip.getText());
        }
        return mysqlconfig;
    }  
}
