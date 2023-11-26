/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import Database.Koneksi;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class kemasan extends javax.swing.JFrame {
    Koneksi myObject;
    
    public DefaultTableModel modelTabelpackage;
    /**
     * Creates new form frame package
     */
    public kemasan() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        myObject = new Koneksi();
        modelTabelpackage = new DefaultTableModel();
        tabelPackage.setModel(modelTabelpackage);
        modelTabelpackage.addColumn("ID PAKET");
        modelTabelpackage.addColumn("KATAGORI ID");
        modelTabelpackage.addColumn("NAMA MERK");
        modelTabelpackage.addColumn("KETERANGAN");
        modelTabelpackage.addColumn("HARGA PAKET");
        tampilDatapackage();
        
    }
    
     public void tampilDatapackage(){
        try {
            modelTabelpackage.getDataVector().removeAllElements();
            modelTabelpackage.fireTableDataChanged();
        
            PreparedStatement query = myObject.Konek.prepareStatement("SELECT * FROM package");
            ResultSet data = query.executeQuery();
            while (data.next()) {
            Object[] baris = new Object[5];
            baris[0] = data.getString("packageid");
            baris[1] = data.getString("categoryid");
            baris[2] = data.getString("package_nama");
            baris[3] = data.getString("description");
            baris[4] = data.getString("package_price");
            
            modelTabelpackage.addRow(baris);
            
            }
            query.close();
            data.close();
            } catch (Exception e){
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtpackageid = new javax.swing.JTextField();
        txtcategoryid = new javax.swing.JTextField();
        txtpackage_nama = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtpackage_price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPackage = new javax.swing.JTable();
        txtcaridata = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID PAKET");

        jLabel2.setText("KATEGORI ID");

        jLabel3.setText("NAMA MERK");

        jLabel4.setText("KETERANGAN");

        jLabel5.setText("HARGA PAKET");

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("UBAH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("HAPUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtpackageid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpackageidActionPerformed(evt);
            }
        });

        txtpackage_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpackage_namaActionPerformed(evt);
            }
        });

        tabelPackage.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPackage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPackageMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPackage);

        txtcaridata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcaridataActionPerformed(evt);
            }
        });

        jLabel6.setText("cari data");

        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpackage_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtpackageid, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtcategoryid)
                            .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpackage_price))
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69)
                                .addComponent(txtcaridata, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(31, 31, 31)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(41, 41, 41)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtpackageid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtcategoryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpackage_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpackage_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcaridata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpackageidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpackageidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpackageidActionPerformed

    private void txtpackage_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpackage_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpackage_namaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
            if (txtpackageid.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "package belum di isi");
                txtpackageid.requestFocus();
            }else if (txtcategoryid.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "category belum di isi");
                txtcategoryid.requestFocus();
            }else if (txtpackage_nama.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "package_nama belum di isi");
                txtpackage_nama.requestFocus();
            }else if (txtdesc.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "description belum di isi");
                txtdesc.requestFocus();
            }else if (txtpackage_price.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "package_price belum di isi");
                txtpackage_price.requestFocus();
            }else {
                String sql = "insert into package value ('"+txtpackageid.getText()+"','"+txtcategoryid.getText()+"','"+txtpackage_nama.getText()+"','"+txtdesc.getText()+"','"+txtpackage_price.getText()+"')";
                myObject.Konek.createStatement().execute(sql);
                tampilDatapackage();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if (
                    (txtpackageid.getText().isEmpty()) &&
                    (txtcategoryid.getText().isEmpty()) &&
                    (txtpackage_nama.getText().isEmpty()) &&
                    (txtdesc.getText().isEmpty()) &&
                    (txtpackage_price.getText().isEmpty())
                ){
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
            }else
            {
                String sql = "UPDATE package SET categoryid=?, package_nama=?, description =?, package_price=? WHERE packageid=?";
                PreparedStatement ubah = myObject.Konek.prepareStatement(sql);
                ubah.setString(1, txtcategoryid.getText());
                ubah.setString(2, txtpackage_nama.getText());
                ubah.setString(3, txtdesc.getText());
                ubah.setString(4, txtpackage_price.getText());
                ubah.setString(5, txtpackageid.getText());
                ubah.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Diubah!");
                tampilDatapackage();
            }
        } catch (Exception e){
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
            if (
                    (txtpackageid.getText().isEmpty()) &&
                    (txtcategoryid.getText().isEmpty()) &&
                    (txtpackage_nama .getText().isEmpty()) &&
                    (txtdesc.getText().isEmpty()) &&
                    (txtpackage_price.getText().isEmpty())
                ){
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
            }else
            {
                String sql = "DELETE FROM package WHERE packageid=?";
                PreparedStatement hapus = myObject.Konek.prepareStatement(sql);
                hapus.setString(1, txtpackageid.getText());
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!");
                tampilDatapackage();
            }
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tabelPackageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPackageMouseClicked
        // TODO add your handling code here:
         int baris = tabelPackage.getSelectedRow();
        String packageid = tabelPackage.getValueAt(baris, 0).toString();
        String categoryid = tabelPackage.getValueAt(baris, 1).toString();
        String package_nama = tabelPackage.getValueAt(baris, 2).toString();
        String description= tabelPackage.getValueAt(baris, 3).toString();
        String package_price= tabelPackage.getValueAt(baris, 4).toString();
        txtpackageid.setText(packageid);
        txtcategoryid.setText(categoryid);
        txtpackage_nama.setText(package_nama);
        txtdesc.setText(description);
        txtpackage_price.setText(package_price);                                     
    }//GEN-LAST:event_tabelPackageMouseClicked

    private void txtcaridataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcaridataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcaridataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(kemasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kemasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kemasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kemasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kemasan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPackage;
    private javax.swing.JTextField txtcaridata;
    private javax.swing.JTextField txtcategoryid;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtpackage_nama;
    private javax.swing.JTextField txtpackage_price;
    private javax.swing.JTextField txtpackageid;
    // End of variables declaration//GEN-END:variables
}