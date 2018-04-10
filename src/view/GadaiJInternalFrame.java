/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.GadaiController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fitriany Chairunnisa
 */
public final class GadaiJInternalFrame extends javax.swing.JInternalFrame {
    private final String header[] = {"ID Gadai", "No. Identitas",
        "Tanggal Pengajuan", "Jatuh Tempo", "Jumlah Pinjaman", "Status"};
//    private String[] headerTable={"id_gadai","no_identitas",
//            "tanggal_pengajuan","jatuh_tempo","jumlah_pinjaman","id_barang", "id_status"};
    
    public final GadaiController gadai;
    
    private List<String> datas;
    /**
     * Creates new form GadaiJInternalFrame
     */
    public GadaiJInternalFrame() {
        initComponents();
        datas = new ArrayList<>();
        gadai = new GadaiController();
        datas = gadai.bindingAll(tblGadai, header);
        //gadai.bindingAll(tblGadai, header);
        gadai.loadStatus(cmbStatus);

        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNoIdent = new javax.swing.JTextField();
        btnCariIdent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGadai = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSimpanGadai = new javax.swing.JButton();
        btnHapusGadai = new javax.swing.JButton();
        tfIdGadai = new javax.swing.JTextField();
        tfJmlPinjaman = new javax.swing.JTextField();
        tfTanggalPengajuan = new com.toedter.calendar.JDateChooser();
        tfJatuhTempo = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tfNoId = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gadai");

        tfNoIdent.setToolTipText("No. Identitas");
        tfNoIdent.setName("No. Identitas"); // NOI18N

        btnCariIdent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/Button-Next-icon.png"))); // NOI18N
        btnCariIdent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariIdentActionPerformed(evt);
            }
        });

        tblGadai.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGadai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGadaiMouseClicked(evt);
            }
        });
        tblGadai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblGadaiKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblGadai);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("ID Gadai");

        jLabel2.setText("Tanggal Pengajuan");

        jLabel3.setText("Jatuh Tempo");

        jLabel4.setText("Jumlah Pinjaman");

        jLabel5.setText("Status");

        btnSimpanGadai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/Button-Ok-icon.png"))); // NOI18N
        btnSimpanGadai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanGadaiActionPerformed(evt);
            }
        });

        btnHapusGadai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/Button-Delete-icon.png"))); // NOI18N
        btnHapusGadai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusGadaiActionPerformed(evt);
            }
        });

        tfIdGadai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIdGadaiKeyPressed(evt);
            }
        });

        tfJmlPinjaman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfJmlPinjamanKeyTyped(evt);
            }
        });

        jLabel6.setText("No. Identitas");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Form Gadai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(tfTanggalPengajuan, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(65, 65, 65)
                                .addComponent(tfJatuhTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(86, 86, 86)
                                .addComponent(tfIdGadai, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSimpanGadai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)
                                        .addComponent(btnHapusGadai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))
                                    .addComponent(cmbStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfJmlPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfIdGadai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTanggalPengajuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfJatuhTempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfJmlPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpanGadai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusGadai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/pegadaian-header3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNoIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCariIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCariIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNoIdent))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariIdentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariIdentActionPerformed
         String kolom ="";
       switch (tblGadai.getSelectedColumn()){
           case 0:kolom="no_identitas";break;
       }
        gadai.bindingSearch(tblGadai, header, kolom, tfNoIdent.getText());
    }//GEN-LAST:event_btnCariIdentActionPerformed

    private void btnSimpanGadaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanGadaiActionPerformed
        boolean hasil = false;
        hasil = gadai.save (tfIdGadai.getText(),
                tfTanggalPengajuan.getDate().getTime()+ "",
                tfJatuhTempo.getDate().getTime()+ "",
               tfJmlPinjaman.getText(),tfNoId.getText(),
               //cmbBrg.getSelectedItem().toString(),
                cmbStatus.getSelectedItem().toString()
               ,tfIdGadai.isEnabled()
        );
        String pesan = "Gagal menambahkan data";
        if (hasil) {
            try {
                pesan = "Berhasil menambahkan Data";
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        JOptionPane.showMessageDialog(this, pesan);
        gadai.bindingAll(tblGadai, header);
        reset();
    }//GEN-LAST:event_btnSimpanGadaiActionPerformed

    private void tblGadaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblGadaiKeyPressed
         
    }//GEN-LAST:event_tblGadaiKeyPressed

    private void tblGadaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGadaiMouseClicked
        int row = tblGadai.getSelectedRow();
        tfIdGadai.setText("" + tblGadai.getValueAt(tblGadai.getSelectedRow(), 0) + "");
        tfNoId.setText("" + tblGadai.getValueAt(tblGadai.getSelectedRow(), 1) + "");
        tfTanggalPengajuan.setDate((Date) tblGadai.getValueAt(tblGadai.getSelectedRow(), 2));
        tfJatuhTempo.setDate((Date) tblGadai.getValueAt(tblGadai.getSelectedRow(), 3));
        tfJmlPinjaman.setText("" + tblGadai.getValueAt(tblGadai.getSelectedRow(), 4) + "");
        
        cmbStatus.setSelectedItem(getCombo(true).get(row));
        System.out.println(getCombo(true).get(row));
        //tfSisa.setText("" + tblGadai.getValueAt(tblGadai.getSelectedRow(), 5) + "");
        tfIdGadai.setEnabled(false);
        tfNoId.setEnabled(false);
        btnHapusGadai.setEnabled(true);
        btnSimpanGadai.setEnabled(true);
    }//GEN-LAST:event_tblGadaiMouseClicked

    private void btnHapusGadaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusGadaiActionPerformed
       int i = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin dihapus?");
        if (i == 0) {
            try {
                String pesan = "Gagal hapus";
                boolean hasil = gadai.delete(tfIdGadai.getText());
                if (hasil) {
                    pesan = "Hore Berhasil";
                    reset();
                }
                JOptionPane.showMessageDialog(this, pesan);
                gadai.bindingAll(tblGadai, header);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnHapusGadaiActionPerformed

    private void tfIdGadaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdGadaiKeyPressed
        btnHapusGadai.setEnabled(true);
        btnSimpanGadai.setEnabled(true);
    }//GEN-LAST:event_tfIdGadaiKeyPressed

    private void tfJmlPinjamanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfJmlPinjamanKeyTyped

    }//GEN-LAST:event_tfJmlPinjamanKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariIdent;
    private javax.swing.JButton btnHapusGadai;
    private javax.swing.JButton btnSimpanGadai;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGadai;
    private javax.swing.JTextField tfIdGadai;
    private com.toedter.calendar.JDateChooser tfJatuhTempo;
    private javax.swing.JTextField tfJmlPinjaman;
    private javax.swing.JTextField tfNoId;
    private javax.swing.JTextField tfNoIdent;
    private com.toedter.calendar.JDateChooser tfTanggalPengajuan;
    // End of variables declaration//GEN-END:variables
        private void reset(){
        tfIdGadai.setText("");
        tfNoId.setText("");
        tfJmlPinjaman.setText("");
        tfTanggalPengajuan.setDate(new Date());
        tfJatuhTempo.setDate(new Date());
       // cmbBrg.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);
        btnSimpanGadai.setEnabled(false);
        btnHapusGadai.setEnabled(false); 
        tfIdGadai.setEnabled(true);
    }

            private List<String> getCombo(boolean isJenis){
        List<String> isi = new ArrayList<>();
        String[] daftar = new String[datas.size()];
        for (String data : datas) {
            daftar = data.split(";");
            if (isJenis) isi.add(daftar[1]);
            else isi.add(daftar[0]);
        }
        return isi;
    }
}
