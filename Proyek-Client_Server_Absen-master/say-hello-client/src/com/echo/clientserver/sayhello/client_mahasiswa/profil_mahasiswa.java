package com.echo.clientserver.sayhello.client_mahasiswa;

import koneksi_client.ip_form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import login_form.login_all;

public class profil_mahasiswa extends javax.swing.JPanel {
    login_all akses_login_profil = new login_all();
    Connection con_mahasiswa;
    Statement stat_mahasiswa;
    ResultSet rs_mahasiswa;
    String sql_mahasiswa, akhir;
    
    /** Creates new form profil_mahasiswa */
    public profil_mahasiswa(String tampil) {
        initComponents();
        akhir = tampil;
        tampildatamahasiswadiprofil();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        et_nim_mahasiswa = new javax.swing.JTextField();
        et_nama_mahasiswa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        et_kelas_mahasiswa = new javax.swing.JTextField();
        et_jurusan_mahasiswa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1090, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("NIM");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 195, -1, -1));

        et_nim_mahasiswa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add(et_nim_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 330, -1));

        et_nama_mahasiswa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add(et_nama_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 330, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setText("Nama ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 115, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 130, 140));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Kelas");
        jLabel7.setToolTipText("");
        jLabel7.setName(""); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        et_kelas_mahasiswa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_kelas_mahasiswa.setName("et_kelas"); // NOI18N
        add(et_kelas_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 330, -1));

        et_jurusan_mahasiswa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_jurusan_mahasiswa.setName("et_kelas"); // NOI18N
        add(et_jurusan_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 330, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("Jurusan");
        jLabel10.setToolTipText("");
        jLabel10.setName(""); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 49, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void tampildatamahasiswadiprofil(){
        try
        {
            Connection c = ip_form.configDB();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM profil_mahasiswa WHERE username_mhs='"+akhir+"'";
            ResultSet r = s.executeQuery(sql);

            while(r.next())
            {
                et_nama_mahasiswa.setText(r.getString("nama_mhs"));
                et_nim_mahasiswa.setText(r.getString("username_mhs"));
                et_kelas_mahasiswa.setText(r.getString("kelas_mhs"));
                et_jurusan_mahasiswa.setText(r.getString("jurusan_mhs"));
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"GAGAL");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField et_jurusan_mahasiswa;
    public javax.swing.JTextField et_kelas_mahasiswa;
    public javax.swing.JTextField et_nama_mahasiswa;
    public javax.swing.JTextField et_nim_mahasiswa;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
