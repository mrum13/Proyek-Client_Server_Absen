/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian_operator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.nimbus.NimbusStyle;

/**
 *
 * @author R
 */
public class buat_kelas extends javax.swing.JPanel {
    String dir,sql,sql2,id_absen;
    String temp="";
    String id_lengkap[]=new String[17];
    int nim[];
    int index=0;
    int y;
    
    /**
     * Creates new form buat_kelas
     */
    public buat_kelas() {
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

        jPanel1 = new javax.swing.JPanel();
        panel_alas = new javax.swing.JPanel();
        btn_browse = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_file = new javax.swing.JLabel();
        et_file = new javax.swing.JTextField();
        txt_ruang = new javax.swing.JLabel();
        txt_id_matkul = new javax.swing.JLabel();
        txt_matkul = new javax.swing.JLabel();
        et_ruang = new javax.swing.JTextField();
        et_matkul = new javax.swing.JTextField();
        et_id_matkul = new javax.swing.JTextField();
        btn_buat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1093, 652));

        panel_alas.setBackground(new java.awt.Color(245, 245, 245));
        panel_alas.setLayout(null);

        btn_browse.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_browse.setForeground(new java.awt.Color(255, 255, 255));
        btn_browse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_browse.setText("Browse");
        btn_browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_browseMouseClicked(evt);
            }
        });
        panel_alas.add(btn_browse);
        btn_browse.setBounds(280, 360, 80, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagian_operator/icon/Button Login.png"))); // NOI18N
        panel_alas.add(jLabel7);
        jLabel7.setBounds(280, 360, 90, 40);

        txt_file.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_file.setText("File Excell");
        panel_alas.add(txt_file);
        txt_file.setBounds(30, 280, 230, 40);

        et_file.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_file.setToolTipText("Cari");
        panel_alas.add(et_file);
        et_file.setBounds(280, 280, 490, 40);

        txt_ruang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_ruang.setText("Ruang");
        panel_alas.add(txt_ruang);
        txt_ruang.setBounds(30, 200, 230, 40);

        txt_id_matkul.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_id_matkul.setText("ID Mata Kuliah");
        panel_alas.add(txt_id_matkul);
        txt_id_matkul.setBounds(30, 50, 230, 40);

        txt_matkul.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_matkul.setText("Nama Mata Kuliah");
        panel_alas.add(txt_matkul);
        txt_matkul.setBounds(30, 120, 230, 40);

        et_ruang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_ruang.setToolTipText("Cari");
        panel_alas.add(et_ruang);
        et_ruang.setBounds(280, 200, 490, 40);

        et_matkul.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_matkul.setToolTipText("Cari");
        panel_alas.add(et_matkul);
        et_matkul.setBounds(280, 120, 490, 40);

        et_id_matkul.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_id_matkul.setToolTipText("Cari");
        panel_alas.add(et_id_matkul);
        et_id_matkul.setBounds(280, 50, 490, 40);

        btn_buat.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_buat.setForeground(new java.awt.Color(255, 255, 255));
        btn_buat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_buat.setText("Simpan");
        btn_buat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buatMouseClicked(evt);
            }
        });
        panel_alas.add(btn_buat);
        btn_buat.setBounds(820, 50, 170, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagian_operator/icon/Button_Connect.png"))); // NOI18N
        panel_alas.add(jLabel5);
        jLabel5.setBounds(820, 50, 180, 50);

        btn_clear.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
        });
        panel_alas.add(btn_clear);
        btn_clear.setBounds(820, 130, 180, 50);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagian_operator/icon/Button_Dis.png"))); // NOI18N
        panel_alas.add(jLabel6);
        jLabel6.setBounds(820, 130, 180, 50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_alas, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_alas, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buatMouseClicked
        // TODO add your handling code here:
        try{
            BufferedReader br = new BufferedReader (new FileReader(dir));
            String line;
            String x,c;
            x=null;
            c=null;
            Boolean absen=true;
            sql="";
            java.sql.Connection con=(Connection)koneksi.configDB();
            java.sql.Connection conn=(Connection)koneksi.configDB();
            while ((line=br.readLine())!=null){
                String[] value = line .split(",");
//                jTextField1.setText(value[2]);
                id_absen=value[3]+value[2]+et_id_matkul.getText()+et_ruang.getText();//2019ATI01L401
                if(sql.equals("")){
                    for (int i=1;i<=16;i++){
                        if (i<=9){
                            id_lengkap[i]=id_absen+"0"+i;
                        }else {
                            id_lengkap[i]=id_absen+i;
                        }
                        sql="INSERT INTO absen  VALUES ('"+id_lengkap[i]+"',0000-00-00,'00:00:00')";    
                        java.sql.PreparedStatement stmt = con.prepareStatement(sql);
                        stmt=con.prepareStatement(sql);
                        stmt.executeUpdate();   
                        }
                    }
                        
                            for(y=1;y<=16;y++){
                                sql2="INSERT INTO absen_detail VALUES ('"+id_lengkap[y]+"','"+value[0]+"',0000-00-00,'00:00:00','')";
                                java.sql.PreparedStatement pst = conn.prepareStatement(sql2);
                                pst=conn.prepareStatement(sql2);
                                pst.executeUpdate();
                            } 
                    
                    index++;
//                }
//
            }
            br.close();
            System.out.println("Berhasil input");
            JOptionPane.showMessageDialog(null,"Berhasil Simpan");
        } catch (SQLException ex) {
            Logger.getLogger(buat_kelas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Gagal Simpan");
        } catch (IOException ex) {
            Logger.getLogger(buat_kelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buatMouseClicked

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clearMouseClicked

    private void btn_browseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_browseMouseClicked
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);

        File file = jfc.getSelectedFile();
        dir = file.getAbsolutePath();
        et_file.setText(dir);
        
    }//GEN-LAST:event_btn_browseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_browse;
    private javax.swing.JLabel btn_buat;
    private javax.swing.JLabel btn_clear;
    private javax.swing.JTextField et_file;
    private javax.swing.JTextField et_id_matkul;
    private javax.swing.JTextField et_matkul;
    private javax.swing.JTextField et_ruang;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_alas;
    public javax.swing.JLabel txt_file;
    public javax.swing.JLabel txt_id_matkul;
    public javax.swing.JLabel txt_matkul;
    public javax.swing.JLabel txt_ruang;
    // End of variables declaration//GEN-END:variables
}