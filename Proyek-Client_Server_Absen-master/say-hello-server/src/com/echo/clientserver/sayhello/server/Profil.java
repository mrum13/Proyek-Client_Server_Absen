/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo.clientserver.sayhello.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author R
 */
public class Profil extends javax.swing.JPanel {
    login_form anu_login_lab = new login_form();
    Connection c_laboran;
    Statement s_laboran;
    ResultSet r_laboran;
    String sql_laboran;
    Home anu_home = new Home();
    
    public String a;
        public String getData(){
            return a;
        }
    /**
     * Creates new form Profil
     */
    public Profil() {
        initComponents();
    }
    
    public void tampildata(){
        try{
            c_laboran = koneksi.configDB();
            s_laboran = c_laboran.createStatement();
            sql_laboran = "SELECT * FROM profil_laboran";
            r_laboran = s_laboran.executeQuery(sql_laboran);
            while(r_laboran.next()){
                    et_nama_lab1.setText(r_laboran.getString("nama_laboran"));
                    et_jab.setText(r_laboran.getString("jabatan_laboran"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"GAGAL");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        et_jab = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        et_nama_lab1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(920, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Jabatan");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 195, -1, -1));

        et_jab.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add(et_jab, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 270, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Nama ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 115, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/echo/clientserver/sayhello/server/icon/Rectangle 4.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 49, -1, -1));

        et_nama_lab1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add(et_nama_lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 270, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField et_jab;
    private javax.swing.JTextField et_nama_lab1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
