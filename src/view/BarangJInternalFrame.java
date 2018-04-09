/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.BarangController;
import javax.swing.JOptionPane;

/**
 *
 * @author Fitriany Chairunnisa
 */
public class BarangJInternalFrame extends javax.swing.JInternalFrame {
    private String[] header={"NO.",
            "ID Barang","Nama Barang","Jenis"};
    private String[] headerTable={"id_barang",
            "nama_barang","id_jenis"};
    public BarangController bc;
    /**
     * Creates new form BarangJInternalFrame
     */
    public BarangJInternalFrame() {
        initComponents();
        bc = new BarangController();
        bc.bindingAll(tblBarang, header);
        bc.loadJenis(cmbJenis);
        bc.loadJenis(cmbJenisBarang);
        
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

        jPanel1 = new javax.swing.JPanel();
        cmbJenis = new javax.swing.JComboBox<>();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfIdBarang = new javax.swing.JTextField();
        tfNamaBarang = new javax.swing.JTextField();
        cmbJenisBarang = new javax.swing.JComboBox<>();
        btnSimpanJenis = new javax.swing.JButton();
        btnHapusJenis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("List Barang");

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - Pilih - -" }));

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setName("Form Barang"); // NOI18N

        jLabel2.setText("ID Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Jenis");

        tfIdBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIdBarangKeyPressed(evt);
            }
        });

        tfNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaBarangActionPerformed(evt);
            }
        });

        cmbJenisBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - Pilih - -" }));

        btnSimpanJenis.setText("Simpan");
        btnSimpanJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanJenisActionPerformed(evt);
            }
        });

        btnHapusJenis.setText("Hapus");
        btnHapusJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusJenisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Form Barang");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHapusJenis)
                                    .addComponent(btnSimpanJenis)))))
                    .addComponent(jLabel1))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(tfIdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpanJenis))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapusJenis))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnCari))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String jns = cmbJenis.getSelectedItem().toString();
        String a[] = jns.split(" - ");
        System.out.println(a[0]+", "+a[1]);
        
         bc.bindingSearch(tblBarang, header, "idJenis",a[0]);
        
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanJenisActionPerformed
         boolean hasil = false;
        hasil = bc.save((Short.parseShort(tfIdBarang.getText())), tfNamaBarang.getText()
                    , cmbJenisBarang.getSelectedItem().toString(),
                    tfIdBarang.isEnabled());
        String pesan = "Gagal menyimpan data";
        if (hasil) {
            pesan = "Berhasil menyimpan data";
        }
        JOptionPane.showMessageDialog(this, pesan);
        bc.bindingAll(tblBarang, header);
        reset();
    }//GEN-LAST:event_btnSimpanJenisActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
        tfIdBarang.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(), 1) + "");
        tfNamaBarang.setText(tblBarang.getValueAt(tblBarang.getSelectedRow(), 2) + "");
        cmbJenisBarang.setSelectedItem(tblBarang.getValueAt(tblBarang.getSelectedRow(),3) + "") ;
        
        //cmbCountry.getSelectedItem(tblLocation.getValueAt(tblLocation.getSelectedRow(), 6)+ "") ;
        
        tfIdBarang.setEnabled(false);
        btnSimpanJenis.setEnabled(true);
        btnHapusJenis.setEnabled(true);
    }//GEN-LAST:event_tblBarangMouseClicked

    private void btnHapusJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusJenisActionPerformed
    int i = JOptionPane.showConfirmDialog(null, "Apakah Mau di hapus?");
        if (i == 0) {
            String pesan = "Gagal Hapus";
            boolean hasil = bc.delete(Short.parseShort(tfIdBarang.getText()));
            if (hasil) {
                pesan = "Berhasil hapus";
            }
            JOptionPane.showMessageDialog(this, pesan);

            bc.bindingAll(tblBarang, header);
            reset();
            btnSimpanJenis.setEnabled(true);
            tfIdBarang.setEnabled(true);
        }
           
    }//GEN-LAST:event_btnHapusJenisActionPerformed

    private void tfNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaBarangActionPerformed

    private void tfIdBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdBarangKeyPressed
        btnSimpanJenis.setEnabled(true);
        btnHapusJenis.setEnabled(true);
    }//GEN-LAST:event_tfIdBarangKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapusJenis;
    private javax.swing.JButton btnSimpanJenis;
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JComboBox<String> cmbJenisBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField tfIdBarang;
    private javax.swing.JTextField tfNamaBarang;
    // End of variables declaration//GEN-END:variables
    public void reset(){
        tfIdBarang.setText("");
        tfNamaBarang.setText("");
        cmbJenis.setSelectedIndex(0);
        cmbJenisBarang.setSelectedIndex(0);
        btnHapusJenis.setEnabled(false);
        btnSimpanJenis.setEnabled(false); 
        tfIdBarang.setEnabled(true);
    }

}
