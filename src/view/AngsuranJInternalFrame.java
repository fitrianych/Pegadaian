/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AngsuranController;
import controller.GadaiController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import oracle.jdbc.driver.Message;

/**
 *
 * @author Fitriany Chairunnisa
 */
public class AngsuranJInternalFrame extends javax.swing.JInternalFrame {
    private String header[] = {"No. Transaksi", "No. Identitas","Nama",
        "ID Gadai", "Tanggal Peminjaman","Jatuh Tempo","Tanggal Angsuran", "Jumlah Angsuran","Pinjaman", "Denda", 
        "Total"};
//    private String[] headerTable={"id_angsuran","no_identitas","no_identitas",
//            "id_gadai","tanggal_angsuran","jumlah_angsuran","denda"};
    /**
     * Creates new form AngsuranJInternalFrame
     */
    public AngsuranController ang;
    
    public AngsuranJInternalFrame() {
        initComponents();
        ang = new AngsuranController();
        ang.bindingAll(tblAngsuran, header);
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

        cmbCariAng = new javax.swing.JComboBox<>();
        tfCariAngsur = new javax.swing.JTextField();
        btnCariAngsur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAngsuran = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfIdAngsuran = new javax.swing.JTextField();
        tfNoIdentitasAng = new javax.swing.JTextField();
        tfIdGadaii = new javax.swing.JTextField();
        tfJmlAngsuran = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateAngsuran = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfDenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfJatuhTempo = new javax.swing.JTextField();
        tfAngsuran = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfHutang = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        btnSimpanAngsuran = new javax.swing.JButton();
        btnHapusAngsuran = new javax.swing.JButton();
        btnCek = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Angsuran");

        cmbCariAng.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - Pilih - -", "No. Identitas", "ID Gadai", "No. Transaksi" }));

        btnCariAngsur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/Button-Next-icon.png"))); // NOI18N
        btnCariAngsur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAngsurActionPerformed(evt);
            }
        });

        tblAngsuran.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAngsuran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAngsuranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAngsuran);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("No. Transaksi");

        jLabel2.setText("No. Identitas");

        jLabel3.setText("ID Gadai");

        jLabel4.setText("Tanggal Angsuran");

        jLabel5.setText("Jumlah Angsuran");

        tfIdAngsuran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIdAngsuranKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Form Angsuran");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNoIdentitasAng, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateAngsuran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(tfIdGadaii, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tfJmlAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfIdAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNoIdentitasAng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(tfIdGadaii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addComponent(jDateAngsuran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfJmlAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(63, 63, 63))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/pegadaian-header3.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Form Denda");

        jLabel10.setText("Jatuh Tempo");

        jLabel11.setText("Tanggal Angsuran");

        jLabel6.setText("Denda");

        tfJatuhTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJatuhTempoActionPerformed(evt);
            }
        });

        jLabel12.setText("Pinjaman");

        jLabel13.setText("Total");

        tfTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAngsuran)
                            .addComponent(tfJatuhTempo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfHutang, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(tfDenda)
                            .addComponent(tfTotal))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfJatuhTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfHutang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSimpanAngsuran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/Button-Ok-icon.png"))); // NOI18N
        btnSimpanAngsuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanAngsuranActionPerformed(evt);
            }
        });

        btnHapusAngsuran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/Button-Delete-icon.png"))); // NOI18N
        btnHapusAngsuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusAngsuranActionPerformed(evt);
            }
        });

        btnCek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pegadaian/WhatsApp Image 2018-04-10 at 16.39.46.jpeg"))); // NOI18N
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cmbCariAng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCariAngsur, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariAngsur, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSimpanAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapusAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCek, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCariAng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCariAngsur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnCariAngsur, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapusAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCek, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpanAngsuran, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusAngsuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusAngsuranActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin dihapus?");
        if (i == 0) {
            try {
                String pesan = "Gagal hapus";
                boolean hasil = ang.delete(tfIdAngsuran.getText());
                if (hasil) {
                    pesan = "Hore Berhasil";
                    //reset();
                }
                JOptionPane.showMessageDialog(this, pesan);
                ang.bindingAll(tblAngsuran, header);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        reset();
    }//GEN-LAST:event_btnHapusAngsuranActionPerformed

    private void btnCariAngsurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAngsurActionPerformed
        String kolom ="";
       switch (cmbCariAng.getSelectedIndex()){
           case 0:kolom="";break;
           case 1:kolom="no_identitas";break;
           case 2:kolom="id_gadai";break;
           case 3:kolom="id_angsuran";break;
       }
        
        ang.bindingSearch(tblAngsuran, header, kolom, tfCariAngsur.getText());
    }//GEN-LAST:event_btnCariAngsurActionPerformed

    private void btnSimpanAngsuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanAngsuranActionPerformed
        boolean hasil = false;
        hasil = ang.save (tfIdAngsuran.getText(),tfNoIdentitasAng.getText(),tfIdGadaii.getText(),
                jDateAngsuran.getDate().getTime()+ "",
               tfJmlAngsuran.getText(),
               tfDenda.getText(),
               tfTotal.getText(),
               tfIdAngsuran.isEnabled());  
        String pesan = "Gagal menambahkan Data";
        if (hasil) {
            try {
                pesan = "Sukses!";
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        JOptionPane.showMessageDialog(this, pesan);
        boolean cek = new GadaiController().cek(tfIdGadaii.getText());
        if (cek) {
            new GadaiController().update(tfIdGadaii.getText(), "a");
            
        }
        
        //boolean cek1 = new 
       ang.bindingAll(tblAngsuran, header);
       // reset();
    }//GEN-LAST:event_btnSimpanAngsuranActionPerformed

    private void tblAngsuranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAngsuranMouseClicked
        tfIdAngsuran.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 0) + "");
        tfNoIdentitasAng.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 1) + "");
        tfIdGadaii.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 3) + "");
        jDateAngsuran.setDate((Date) tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 6));
        tfJmlAngsuran.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 7) + "");
        tfDenda.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 9) + "");
        tfHutang.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 8) + "");
        tfJatuhTempo.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 5) + "");
        tfAngsuran.setText("" + tblAngsuran.getValueAt(tblAngsuran.getSelectedRow(), 6) + "");
        tfIdAngsuran.setEnabled(false);
        //tfNoIdentitasAng.setEnabled(false);
        //tfIdGadaii.setEnabled(false);
        btnHapusAngsuran.setEnabled(true);
        btnSimpanAngsuran.setEnabled(true);
    }//GEN-LAST:event_tblAngsuranMouseClicked

    private void tfIdAngsuranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdAngsuranKeyPressed
        btnHapusAngsuran.setEnabled(true);
        btnSimpanAngsuran.setEnabled(true);
    }//GEN-LAST:event_tfIdAngsuranKeyPressed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        try {
            String id_gadai = tfIdGadaii.getText();
            String tglsatu = tfJatuhTempo.getText();
            DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date tglJatuhTempo = (Date) date.parse(tglsatu);
            String tgldua = tfAngsuran.getText();
            Date tglAngsuran = (Date) date.parse(tgldua);

            long bedaHari = (tglAngsuran.getTime() - tglJatuhTempo.getTime());
            
            //boolean cek = new GadaiController().cek(tfIdGadaii.getText());

            if (TimeUnit.MILLISECONDS.toDays(bedaHari) >= 7
                    )
            {
                int denda = (int) (TimeUnit.MILLISECONDS.toDays(bedaHari));
                Integer pinjam = Integer.parseInt(tfHutang.getText()) ;
                tfDenda.setText(denda + 0.01 * pinjam + "");  
                
                
                 //new AngsuranController().update(tfDenda.getText());
            }
            else{
                   JOptionPane.showMessageDialog(null, "Tidak Ada Denda");
                   tfDenda.setText(0 + "");
                    System.out.println("tidak ada denda");
            }
                double a = Double.parseDouble(tfDenda.getText());
                double b = Double.parseDouble(tfJmlAngsuran.getText());
                double hasil = a + b;
                tfTotal.setText(Double.toString(hasil));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " +e);
        }
        
    }//GEN-LAST:event_btnCekActionPerformed

    private void tfJatuhTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJatuhTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJatuhTempoActionPerformed

    private void tfTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariAngsur;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnHapusAngsuran;
    private javax.swing.JButton btnSimpanAngsuran;
    private javax.swing.JComboBox<String> cmbCariAng;
    private com.toedter.calendar.JDateChooser jDateAngsuran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAngsuran;
    private javax.swing.JTextField tfAngsuran;
    private javax.swing.JTextField tfCariAngsur;
    private javax.swing.JTextField tfDenda;
    private javax.swing.JTextField tfHutang;
    private javax.swing.JTextField tfIdAngsuran;
    private javax.swing.JTextField tfIdGadaii;
    private javax.swing.JTextField tfJatuhTempo;
    private javax.swing.JTextField tfJmlAngsuran;
    private javax.swing.JTextField tfNoIdentitasAng;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
    public void reset(){
        tfIdAngsuran.setText("");
        tfNoIdentitasAng.setText("");
        tfCariAngsur.setText("");
        tfDenda.setText("");
        tfIdGadaii.setText("");
        tfJmlAngsuran.setText("");
        jDateAngsuran.setDate(new Date());
        btnSimpanAngsuran.setEnabled(false);
        btnHapusAngsuran.setEnabled(false); 
        tfIdAngsuran.setEnabled(true);
    }

}
