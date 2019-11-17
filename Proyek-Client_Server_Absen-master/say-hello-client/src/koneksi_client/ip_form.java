/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi_client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login_form.login_all;
/**
 *
 * @author R
 */
public class ip_form extends javax.swing.JFrame {
    login_all frm_login;
    static String konek;
    /**
     * Creates new form ip_fomr
     */
    public ip_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        et_ip = new javax.swing.JTextField();
        btn_setIP = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Masukkan IP Client");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 27, -1, -1));

        et_ip.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_ip.setToolTipText("Cari");
        getContentPane().add(et_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 300, -1));

        btn_setIP.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_setIP.setForeground(new java.awt.Color(255, 255, 255));
        btn_setIP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_setIP.setText("OK");
        btn_setIP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_setIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_setIPMouseClicked(evt);
            }
        });
        getContentPane().add(btn_setIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Button Login.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_setIPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_setIPMouseClicked
        try {
            configDB();
            if (konek=="berhasil"){
                login();
            }
            else if (konek=="gagal"){
                JOptionPane.showMessageDialog(null,"Gagal Konek");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ip_form.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_setIPMouseClicked

    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        
        try {
            String a = et_ip.getText();
            String url="jdbc:mysql://"+et_ip.getText()+"/proyek-fix"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            konek="berhasil";
        } catch (Exception e) {
            konek="gagal";
        }
        return mysqlconfig;
    }
    
    public void login() {
        frm_login = new login_all();
        frm_login.setVisible(true);
        this.setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ip_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ip_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ip_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ip_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ip_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_setIP;
    public static javax.swing.JTextField et_ip;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
