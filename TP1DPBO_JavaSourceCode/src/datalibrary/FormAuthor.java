/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datalibrary;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class FormAuthor extends javax.swing.JFrame {

    private Boolean isUpdate = false;
    dbConnection dbcon = new dbConnection();
    private int idRow;
    /**
     * Creates new form FormAuthor
     */
    public FormAuthor() {
        initComponents();
        dbcon.connect();
        btn_del.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_img = new javax.swing.JTextField();
        lblBukuFB = new javax.swing.JLabel();
        lblCoverFB = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        lblPenerbitFB = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        lblAuthorFB = new javax.swing.JLabel();
        tf_nama = new javax.swing.JTextField();
        tf_jlhbuku = new javax.swing.JTextField();
        btn_del = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_imgActionPerformed(evt);
            }
        });

        lblBukuFB.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        lblBukuFB.setText("Author");

        lblCoverFB.setText("Image");

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        lblPenerbitFB.setText("Nama");

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        lblAuthorFB.setText("Jumlah Buku");

        tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaActionPerformed(evt);
            }
        });

        btn_del.setText("Delete");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(lblBukuFB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPenerbitFB)
                            .addComponent(lblAuthorFB)
                            .addComponent(lblCoverFB))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_del)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancel))
                            .addComponent(tf_nama)
                            .addComponent(tf_jlhbuku)
                            .addComponent(tf_img, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBukuFB)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPenerbitFB)
                    .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthorFB)
                    .addComponent(tf_jlhbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoverFB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_cancel)
                    .addComponent(btn_del))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_imgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_imgActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if (tf_nama.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong.");
        }
        else if (tf_jlhbuku.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Jumlah Buku tidak boleh kosong.");
        }
        else {
            // Get Data
            String nama = tf_nama.getText();
            String jlh_buku = tf_jlhbuku.getText();
            String img = tf_img.getText();
            
            // Jika semua text field terisi, add/update data
            if (isUpdate == false) {
                //insertData
                String ins = "insert into tb_author (nama, jlh_buku, img) values (\"" + 
                        nama + "\", \"" + jlh_buku + "\", \"" + img + "\")";
                System.out.println(ins);
                dbcon.Query(ins);
                
                // Bersihkan textfield setelah insert/add data
                clearTextField();
            }
            else {
                //updateData
                String upd = "update tb_author set nama=\"" + nama + "\", jlh_buku=\"" + jlh_buku + "\", img=\"" +
                        img + "\" where id_author=\"" + idRow + "\"";
                System.out.println(upd);
                dbcon.Query(upd);
                
                // Bersihkan textfield setelah update
                clearTextField();
                btn_add.setText("Add");
                this.isUpdate = false;
            }
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_btn_addActionPerformed

    private void tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namaActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        clearTextField();
        this.setVisible(false);
        btn_add.setText("Add");
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        // TODO add your handling code here:
        //Delete Data
        String upd = "delete from tb_author where id_author=\"" + idRow + "\"";
        System.out.println(upd);
        dbcon.Query(upd);

        // Bersihkan textfield setelah update
        clearTextField();
        btn_add.setText("Add");
        this.isUpdate = false;
        this.setVisible(false);
    }//GEN-LAST:event_btn_delActionPerformed

    private void clearTextField() {
        tf_nama.setText("");
        tf_jlhbuku.setText("");
        tf_img.setText("");
    }
    
    public void setTF(int cek, int id, String s1, String s2, String s3) {
        
        if(cek >= 0) {
            tf_nama.setText(s1);
            tf_jlhbuku.setText(s2);
            tf_img.setText(s3);
            
            btn_add.setText("Update");
            this.isUpdate = true;
            btn_del.setVisible(true);
            idRow = id;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_del;
    private javax.swing.JLabel lblAuthorFB;
    private javax.swing.JLabel lblBukuFB;
    private javax.swing.JLabel lblCoverFB;
    private javax.swing.JLabel lblPenerbitFB;
    private javax.swing.JTextField tf_img;
    private javax.swing.JTextField tf_jlhbuku;
    private javax.swing.JTextField tf_nama;
    // End of variables declaration//GEN-END:variables
}
