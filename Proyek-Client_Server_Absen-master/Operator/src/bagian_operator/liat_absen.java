/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian_operator;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author r
 */
public class liat_absen extends javax.swing.JPanel {
    String matkul,hari,ruang;
    /**
     * Creates new form liat_absen
     */
    public liat_absen() {
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
        txt_ruang = new javax.swing.JLabel();
        cb_ruang = new javax.swing.JComboBox<>();
        txt_hari = new javax.swing.JLabel();
        txt_id_matkul = new javax.swing.JLabel();
        btn_buat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_hari = new javax.swing.JComboBox<>();
        cb_matkul = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_absen = new javax.swing.JTable();

        jPanel1.setPreferredSize(new java.awt.Dimension(1093, 652));

        panel_alas.setBackground(new java.awt.Color(245, 245, 245));
        panel_alas.setLayout(null);

        txt_ruang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_ruang.setText("Ruangan");
        panel_alas.add(txt_ruang);
        txt_ruang.setBounds(30, 130, 150, 40);

        cb_ruang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cb_ruang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L401", "L402", "L403", "L404", "L405", "L406" }));
        cb_ruang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ruangActionPerformed(evt);
            }
        });
        panel_alas.add(cb_ruang);
        cb_ruang.setBounds(210, 130, 310, 40);

        txt_hari.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_hari.setText("Hari ke");
        panel_alas.add(txt_hari);
        txt_hari.setBounds(30, 70, 150, 40);

        txt_id_matkul.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_id_matkul.setText("Mata Kuliah");
        panel_alas.add(txt_id_matkul);
        txt_id_matkul.setBounds(30, 10, 150, 40);

        btn_buat.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_buat.setForeground(new java.awt.Color(255, 255, 255));
        btn_buat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_buat.setText("Cari");
        btn_buat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buatMouseClicked(evt);
            }
        });
        panel_alas.add(btn_buat);
        btn_buat.setBounds(840, 90, 170, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagian_operator/icon/Button_Connect.png"))); // NOI18N
        panel_alas.add(jLabel5);
        jLabel5.setBounds(840, 90, 180, 50);

        cb_hari.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cb_hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        cb_hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_hariActionPerformed(evt);
            }
        });
        panel_alas.add(cb_hari);
        cb_hari.setBounds(210, 70, 310, 40);

        cb_matkul.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cb_matkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PBO A", "WEB A" }));
        cb_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_matkulActionPerformed(evt);
            }
        });
        panel_alas.add(cb_matkul);
        cb_matkul.setBounds(210, 10, 310, 40);

        tbl_absen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_absen);

        panel_alas.add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 990, 400);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_alas, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_alas, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
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
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIM");
        model.addColumn("KETERANGAN");
        
        String itemMatkul = (String) cb_matkul.getSelectedItem ();
        String itemHari = (String) cb_hari.getSelectedItem ();
        String itemRuang = (String) cb_ruang.getSelectedItem ();
        
//matkul & kelas
        if (itemMatkul.equals("PBO A")){
            matkul="APBO";
        }
        else if (itemMatkul.equals("WEB A")){
            matkul="AWEB";
        }

//hari        
        if (itemHari.equals("1")){
            hari="01";
        }
        else if (itemHari.equals("2")){
            hari="02";
        }
        else if (itemHari.equals("3")){
            hari="03";
        }
        else if (itemHari.equals("4")){
            hari="04";
        }
        else if (itemHari.equals("5")){
            hari="05";
        }
        else if (itemHari.equals("6")){
            hari="06";
        }
        else if (itemHari.equals("7")){
            hari="07";
        }
        else if (itemHari.equals("8")){
            hari="08";
        }
        else if (itemHari.equals("9")){
            hari="09";
        }
        else if (itemHari.equals("10")){
            hari="10";
        }
        else if (itemHari.equals("11")){
            hari="11";
        }
        else if (itemHari.equals("12")){
            hari="12";
        }
        else if (itemHari.equals("13")){
            hari="13";
        }
        else if (itemHari.equals("14")){
            hari="14";
        }
        else if (itemHari.equals("15")){
            hari="15";
        }
        else if (itemHari.equals("16")){
            hari="16";
        }
        
//ruang
        if (itemRuang.equals("L401")){
            ruang="L401";
        }
        else if (itemRuang.equals("L402")){
            ruang="L02";
        }
        else if (itemRuang.equals("L403")){
            ruang="L403";
        }
        else if (itemRuang.equals("L404")){
            ruang="L404";
        }
        else if (itemRuang.equals("L405")){
            ruang="L405";
        }
        else if (itemRuang.equals("L406")){
            ruang="L406";
        }
        
        //menampilkan data database kedalam tabel
        //"SELECT username_mhs,nama_mhs FROM profil_mahasiswa INNER JOIN absen_detail ON absen_detail.nim_mhs = profil_mahasiswa.username_mhs"
        try {
            int no=1;
            String sql = "SELECT * FROM absen_detail WHERE id_absen='2019"+matkul+"01"+ruang+""+hari+"' ORDER BY id_absen ASC";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString("nim_mhs"),res.getString("ket")});
            }
            tbl_absen.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Refresh");
        }
    }//GEN-LAST:event_btn_buatMouseClicked

    private void cb_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_matkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_matkulActionPerformed

    private void cb_hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_hariActionPerformed

    private void cb_ruangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ruangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ruangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_buat;
    private javax.swing.JComboBox<String> cb_hari;
    private javax.swing.JComboBox<String> cb_matkul;
    private javax.swing.JComboBox<String> cb_ruang;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_alas;
    private javax.swing.JTable tbl_absen;
    public javax.swing.JLabel txt_hari;
    public javax.swing.JLabel txt_id_matkul;
    public javax.swing.JLabel txt_ruang;
    // End of variables declaration//GEN-END:variables
}