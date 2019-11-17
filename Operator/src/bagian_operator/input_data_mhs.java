package bagian_operator;

import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import bagian_operator.dashboard_opt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import bagian_operator.koneksi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;


public class input_data_mhs extends javax.swing.JPanel {
    String a,dir;
    Statement stat_akses;
    ResultSet rs_akses;
    String sql_akses;
    dashboard_opt akses_dash;
    Registry registry;
    String status, nilai;
    private static final long serialVersionUID = 1L;
    private static Connection connection;
    DefaultTableModel model;
    /**
     * Creates new form Home
     */
    public input_data_mhs() {
        koneksi DB = new koneksi();
        status = "online";
        akses_dash = new dashboard_opt();
//        setLocationRelativeTo(null);
        initComponents();
        model = new DefaultTableModel ( );
        tbl_mhs.setModel(model);
        model.addColumn("NO");
        model.addColumn("NIM");
        model.addColumn("Nama");
//        model.addColumn("Kelas");
//        model.addColumn("Jurusan");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_alas = new javax.swing.JPanel();
        txt_status = new javax.swing.JLabel();
        et_cari_file = new javax.swing.JTextField();
        btn_cari = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mhs = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1093, 652));

        panel_alas.setBackground(new java.awt.Color(245, 245, 245));
        panel_alas.setLayout(null);

        txt_status.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_status.setText("Input file excell");
        txt_status.setToolTipText("");
        panel_alas.add(txt_status);
        txt_status.setBounds(30, 20, 230, 29);

        et_cari_file.setEditable(false);
        et_cari_file.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        et_cari_file.setToolTipText("Cari");
        panel_alas.add(et_cari_file);
        et_cari_file.setBounds(30, 70, 320, 40);

        btn_cari.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_cari.setForeground(new java.awt.Color(255, 255, 255));
        btn_cari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cari.setText("Cari");
        btn_cari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cariMouseClicked(evt);
            }
        });
        panel_alas.add(btn_cari);
        btn_cari.setBounds(380, 70, 90, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagian_operator/icon/Button Login.png"))); // NOI18N
        panel_alas.add(jLabel4);
        jLabel4.setBounds(380, 70, 85, 40);

        btn_simpan.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_simpan.setText("Simpan");
        btn_simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpanMouseClicked(evt);
            }
        });
        panel_alas.add(btn_simpan);
        btn_simpan.setBounds(960, 570, 80, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagian_operator/icon/Button Login.png"))); // NOI18N
        panel_alas.add(jLabel5);
        jLabel5.setBounds(960, 570, 85, 40);

        btn_hapus.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_hapus.setText("Hapus");
        btn_hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapusMouseClicked(evt);
            }
        });
        panel_alas.add(btn_hapus);
        btn_hapus.setBounds(850, 570, 90, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bagian_operator/icon/Button Cancel.png"))); // NOI18N
        panel_alas.add(jLabel6);
        jLabel6.setBounds(850, 570, 85, 40);

        tbl_mhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_mhs.setToolTipText("");
        jScrollPane1.setViewportView(tbl_mhs);

        panel_alas.add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 1010, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_alas, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_alas, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIM");
        model.addColumn("NAMA");
//        model.addColumn("KELAS");
//        model.addColumn("JURUSAN");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "SELECT nim_mhs,nama_mhs FROM data_mhs";
            java.sql.Connection conn=(Connection)koneksi.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2)});
            }
            tbl_mhs.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Gagal Login");
        }
    }
    
    private void btn_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cariMouseClicked
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);

        File file = jfc.getSelectedFile();
        dir = file.getAbsolutePath();
        et_cari_file.setText(dir);
        
    }//GEN-LAST:event_btn_cariMouseClicked

    private void btn_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpanMouseClicked
        // TODO add your handling code here:
        try{
            BufferedReader br = new BufferedReader (new FileReader(dir));
            String line;
            
            while ((line=br.readLine())!=null){
                String[] value = line .split(",");
                String sql = "INSERT INTO data_mhs (no_mhs,nim_mhs,nama_mhs) VALUES('"+value[0]+"','"+value[1]+"','"+value[2]+"')";
                java.sql.Connection con=(Connection)koneksi.configDB();
                java.sql.PreparedStatement stmt = con.prepareStatement(sql);
                stmt=con.prepareStatement(sql);
                stmt.executeUpdate();
            }
            br.close();
            System.out.println("Berhasil input");
        } catch (SQLException ex) {
            Logger.getLogger(input_data_mhs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(input_data_mhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        load_table();
    }//GEN-LAST:event_btn_simpanMouseClicked

    private void browseCSV(){
        JFileChooser jfc = new JFileChooser();
        FileFilter fileFilter = new FileFilter() {
        
        @Override
        public boolean accept(File f) {
            if(f.getName().toLowerCase().endsWith(".csv") || f.isDirectory() ){
                return true;
            }else{
                return false;
            }
        }
        
        public String getDescription() {
            return "*.csv";
        }
        };

        jfc.addChoosableFileFilter((javax.swing.filechooser.FileFilter) fileFilter);
        jfc.setMultiSelectionEnabled(false);
        jfc.showOpenDialog(this);
     //mengambil path file
        String path = jfc.getSelectedFile().getAbsolutePath();
        et_cari_file.setText(path);
        }
    
    private void loadData() throws SQLException{
        connection = koneksi.configDB();
        Statement statement = null;
        String path = validatePath(et_cari_file.getText().toString());
        final String delimiter = ";";
        final String query = "LOAD DATA INFILE '"+path+"' INTO TABLE LOADDATA FIELDS TERMINATED BY '"+delimiter+"'"
        + "LINES TERMINATED BY '\n' (NAMA, NIM);";
        try {
          statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
          statement.executeUpdate(query);
          JOptionPane.showMessageDialog(null, "Sukses");
        } catch (SQLException ex) {
          System.out.println(ex.getMessage());
        }
    }
    
     private String validatePath(String invalidPath){
        String validPath;
        validPath = invalidPath.replace('\\', '/');
        return validPath;
    }
    
    private void btn_hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_hapusMouseClicked

    public void status_online(){
        txt_status.setText("online");
    }
    
    public void status_offline(){
        txt_status.setText("offline");
    }
    
    private void bisa() throws SQLException{
        sql_akses = "INSERT INTO akses_db VALUES ('"+status+"')";
        java.sql.Connection conn=(Connection)koneksi.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql_akses);
        pst.execute();
    }
    
    private void gak_bisa() throws SQLException{
        sql_akses = "DELETE FROM akses_db WHERE akses_mhs='"+status+"'";
        java.sql.Connection conn=(Connection)koneksi.configDB();
        java.sql.PreparedStatement pst=conn.prepareStatement(sql_akses);
        pst.execute();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_cari;
    public javax.swing.JLabel btn_hapus;
    public javax.swing.JLabel btn_simpan;
    public javax.swing.JTextField et_cari_file;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panel_alas;
    public javax.swing.JTable tbl_mhs;
    public javax.swing.JLabel txt_status;
    // End of variables declaration//GEN-END:variables

    
}
