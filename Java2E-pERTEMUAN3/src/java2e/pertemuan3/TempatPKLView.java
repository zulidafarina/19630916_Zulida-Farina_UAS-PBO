/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2e.pertemuan3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INTEL
 */
public class TempatPKLView extends javax.swing.JPanel {

    /**
     * Creates new form TempatPKLView
     */
    public TempatPKLView() {
        initComponents();
        ulang();
        tampil_data();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel dtm; //pilih add import apabila merah
    String url="jdbc:mysql://localhost/praktikum_java2e";
    
    private void ulang(){
        buttonTambah.setEnabled(true);
        buttonUbah.setEnabled(false);
        buttonHapus.setEnabled(false);
        TextTelepon.setText("");
        textNama.setText("");
        textAlamat.setText("");
        textPimpinan.setText("");
    }
    
    //method tampil data
    private void tampil_data(){
        try {
           String[] judul = {"ID",  "NAMA TEMPAT", "ALAMAT", "NO TELEPON", "NAMA PIMPINAN" };//untuk judul tabel
           dtm = new DefaultTableModel(null,judul);
           tabelTempat.setModel(dtm);
           con = DriverManager.getConnection(url, "root", "");//mengatur koneksi
           String sql = "";
           if(textCari.getText().isEmpty()){
               sql = "select * from tempat_pkl";
           }else{
               sql = "select * from tempat_pkl where nama_tempat like '%" + textCari.getText()+"%'";
           }
           pst = con.prepareStatement("select * from tempat_pkl");//menjalankan query
           rs = pst.executeQuery();//karena query select, maka ambil data pakai rs
           while(rs.next()){ //lakukan perulangan selama datanya ada
               String[] data = {rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5)};//rs.getSrting[1] mengambil data di kolom yaitu ID.
               dtm.addRow(data);//data dimasukan ke dalam tabel
           }
               
        } catch (Exception e) {
            System.out.print(e.getMessage());
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

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textAlamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonUlang = new javax.swing.JButton();
        textTutup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTempat = new javax.swing.JTable();
        labelID = new javax.swing.JLabel();
        TextTelepon = new javax.swing.JTextField();
        textPimpinan = new javax.swing.JTextField();
        textCari = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        panel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("FORM TEMPAT PKL");

        jLabel3.setText("NAMA TEMPAT");

        jLabel4.setText("ALAMAT");

        jLabel5.setText("NO TELP");

        jLabel6.setText("NAMA PIMPINAN");

        buttonTambah.setText("TAMBAH");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonUbah.setText("UBAH");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonUlang.setText("ULANG");
        buttonUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUlangActionPerformed(evt);
            }
        });

        textTutup.setText("TUTUP");
        textTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTutupActionPerformed(evt);
            }
        });

        jLabel7.setText("Cari DataTempat PKL Berdasarkan nama tempat\n");

        tabelTempat.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelTempat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTempatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTempat);

        labelID.setText("jLabel8");

        textCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCariKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(77, 77, 77)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                    .addComponent(TextTelepon)
                                    .addComponent(textPimpinan)))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(buttonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(buttonUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelID)
                        .addGap(26, 26, 26)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(textCari)))
                .addGap(254, 254, 254))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(labelID))
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textPimpinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonTambah)
                            .addComponent(buttonUbah)
                            .addComponent(buttonHapus)
                            .addComponent(buttonUlang))
                        .addGap(18, 18, 18)
                        .addComponent(textTutup))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(panel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
       if(textNama.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Nama belum diinput");
            textNama.requestFocus();
        }else if(textAlamat.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Alamat belum diinput");
            textAlamat.requestFocus();
        }else if(TextTelepon.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Telepon belum diinput");
            textAlamat.requestFocus();
        }else if(textPimpinan.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Nama Pimpinan belum diinput");
            textAlamat.requestFocus();
        }else{
            try{
                pst = con.prepareStatement("insert into tempat_pkl values (?,?,?,?,?)");
                pst.setInt(1, 0);
                pst.setString(2, textNama.getText());
                pst.setString(3,textAlamat.getText());
                pst.setString(4, TextTelepon.getText());
                pst.setString(5,textPimpinan.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data tempat_pkl berhasil ditambahkan");
                ulang();
                tampil_data();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
         if(textNama.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Nama belum diinput");
            textNama.requestFocus();
        }else if(textAlamat.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Alamat belum diinput");
            textAlamat.requestFocus();
        }else if(TextTelepon.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Telepon belum diinput");
            textAlamat.requestFocus();
        }else if(textPimpinan.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Nama Pimpinan belum diinput");
            textAlamat.requestFocus();
        }else{
            try{
                pst = con.prepareStatement("update tempat_pkl set nama_tempat=?,  alamat=?, no_telp=?, nama_pimpinan=? where Id_tempat=?");
                pst.setInt(1, 0);
                pst.setString(1, textNama.getText());
                pst.setString(2,textAlamat.getText());
                pst.setString(3, TextTelepon.getText());
                pst.setString(4,textPimpinan.getText());
                pst.setInt(5, Integer.parseInt(labelID.getText()));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data tempat pkl berhasil diperbaharui");
                ulang();
                tampil_data();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        int konfirmasi = JOptionPane.showConfirmDialog(null, "yakin ingin menghapus data tempat pkl ini?", "HAPUS DATA?", 0);
        if(konfirmasi==0){
            try{
                pst = con.prepareStatement("delete from tempat_pkl where Id_tempat =?");
                pst.setInt(1, Integer.parseInt(labelID.getText()));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Tempat pkl berhasil dihapus!");
                ulang();
                tampil_data();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUlangActionPerformed
        ulang();
    }//GEN-LAST:event_buttonUlangActionPerformed

    private void textTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTutupActionPerformed
        int index = HomeView.jTabbedPane1.getSelectedIndex();
        HomeView.jTabbedPane1.remove(index);
    }//GEN-LAST:event_textTutupActionPerformed

    private void tabelTempatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTempatMouseClicked
        int row = tabelTempat.getSelectedRow();
        labelID.setText(tabelTempat.getValueAt(row, 0).toString());
        textNama.setText(tabelTempat.getValueAt(row, 1).toString());
        textAlamat.setText(tabelTempat.getValueAt(row, 2).toString());
        TextTelepon.setText(tabelTempat.getValueAt(row, 3).toString());
        textPimpinan.setText(tabelTempat.getValueAt(row, 4).toString());
        buttonTambah.setEnabled(false);
        buttonUbah.setEnabled(true);
        buttonHapus.setEnabled(true);
    }//GEN-LAST:event_tabelTempatMouseClicked

    private void textCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyReleased
      tampil_data();  // TODO add your handling code here:
    }//GEN-LAST:event_textCariKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextTelepon;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JButton buttonUlang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private java.awt.Panel panel1;
    private javax.swing.JTable tabelTempat;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textCari;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textPimpinan;
    private javax.swing.JButton textTutup;
    // End of variables declaration//GEN-END:variables
}
