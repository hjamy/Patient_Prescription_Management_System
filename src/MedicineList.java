/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
/**
 *
 * @author Tashfiq
 */
public class MedicineList extends javax.swing.JFrame {

    /**
     * Creates new form MedicineList
     */
    public MedicineList() {
        initComponents();
        
        MedicineNameTextField.setBackground(new Color(0,0,0,0));
        StorageAmountTextField.setBackground(new Color(0,0,0,0));
        MedicinePriceTextField.setBackground(new Color(0,0,0,0));
        MedicineListInsertButton.setBackground(new Color(0,0,0,0));
        MedicineListtBackButton.setBackground(new Color(0,0,0,0));
        
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
        jLabel6 = new javax.swing.JLabel();
        MedicineListtBackButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MedicineNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        StorageAmountTextField = new javax.swing.JTextField();
        MedicinePriceTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MedicineListInsertButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MEDICINE LIST");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 30));

        MedicineListtBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/back1.png"))); // NOI18N
        MedicineListtBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineListtBackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MedicineListtBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Medicine Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 30));

        MedicineNameTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MedicineNameTextField.setText("Enter Medicine Name");
        MedicineNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MedicineNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MedicineNameTextFieldFocusGained(evt);
            }
        });
        MedicineNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(MedicineNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 230, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Storage Amount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 30));

        StorageAmountTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StorageAmountTextField.setText("Enter Storage Amount");
        StorageAmountTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StorageAmountTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                StorageAmountTextFieldFocusGained(evt);
            }
        });
        StorageAmountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StorageAmountTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(StorageAmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 230, 35));

        MedicinePriceTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MedicinePriceTextField.setText("Enter Medicine Price");
        MedicinePriceTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MedicinePriceTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MedicinePriceTextFieldFocusGained(evt);
            }
        });
        MedicinePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicinePriceTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(MedicinePriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 230, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Medicine Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 30));

        MedicineListInsertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/insert.png"))); // NOI18N
        MedicineListInsertButton.setBorder(null);
        MedicineListInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineListInsertButtonActionPerformed(evt);
            }
        });
        jPanel1.add(MedicineListInsertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/Medicine.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MedicineListtBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineListtBackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineListtBackButtonActionPerformed

    private void MedicineNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MedicineNameTextFieldFocusGained
        // TODO add your handling code here:
        MedicineNameTextField.setText("");
    }//GEN-LAST:event_MedicineNameTextFieldFocusGained

    private void MedicineNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineNameTextFieldActionPerformed

    private void StorageAmountTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StorageAmountTextFieldFocusGained
        // TODO add your handling code here:
        StorageAmountTextField.setText("");
    }//GEN-LAST:event_StorageAmountTextFieldFocusGained

    private void StorageAmountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StorageAmountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StorageAmountTextFieldActionPerformed

    private void MedicinePriceTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MedicinePriceTextFieldFocusGained
        // TODO add your handling code here:
        MedicinePriceTextField.setText("");
    }//GEN-LAST:event_MedicinePriceTextFieldFocusGained

    private void MedicinePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicinePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicinePriceTextFieldActionPerformed

    private void MedicineListInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineListInsertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineListInsertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MedicineList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicineList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MedicineListInsertButton;
    private javax.swing.JButton MedicineListtBackButton;
    private javax.swing.JTextField MedicineNameTextField;
    private javax.swing.JTextField MedicinePriceTextField;
    private javax.swing.JTextField StorageAmountTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
