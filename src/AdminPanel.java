/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tashfiq
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        
        ExecuteButton.setBackground(new Color(0,0,0,0));
        //AdminAccounttBackButton.setBackground(new Color(0,0,0,0));
        

        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qField = new javax.swing.JTextField();
        ExecuteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        qTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN PANEL");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 234, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Insert your query below");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 360, 30));

        qField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qField.setForeground(new java.awt.Color(51, 51, 51));
        qField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qFieldFocusLost(evt);
            }
        });
        qField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                qFieldMousePressed(evt);
            }
        });
        qField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qFieldActionPerformed(evt);
            }
        });
        qField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qFieldKeyTyped(evt);
            }
        });
        jPanel1.add(qField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 360, 70));

        ExecuteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/execute2.png"))); // NOI18N
        ExecuteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExecuteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 60, 60));

        qTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        qTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qTable.setGridColor(new java.awt.Color(0, 0, 0));
        qTable.setOpaque(false);
        qTable.setRowHeight(25);
        qTable.setSelectionBackground(new java.awt.Color(255, 153, 51));
        qTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(qTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1010, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qFieldFocusGained
        // TODO add your handling code here:
          qField.setText("");
    }//GEN-LAST:event_qFieldFocusGained

    private void qFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_qFieldFocusLost

    private void qFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qFieldMouseClicked
        // TODO add your handling code here:
        //  QueryTextField.setText("");
        // QueryTextField.setText("");
    }//GEN-LAST:event_qFieldMouseClicked

    private void qFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qFieldMousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_qFieldMousePressed

    private void qFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qFieldActionPerformed

    private void qFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qFieldKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_qFieldKeyPressed

    private void qFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qFieldKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_qFieldKeyReleased

    private void qFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qFieldKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_qFieldKeyTyped

    private void ExecuteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteButtonActionPerformed
        // TODO add your handling code here:
        String temp_string = qField.getText().trim();
        if(!temp_string.isEmpty())
        {
            ConnectMSSQL cnObj = new ConnectMSSQL();
            cnObj.adminQ(temp_string);
            
            String[] column_name = cnObj.q_label.toArray(new String[cnObj.q_label.size()]);
            String[][] table_data = cnObj.q_data.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);

            DefaultTableModel model = (DefaultTableModel)qTable.getModel();
            model.setDataVector(table_data, column_name);
            
            
            
        }
    }//GEN-LAST:event_ExecuteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExecuteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qField;
    private javax.swing.JTable qTable;
    // End of variables declaration//GEN-END:variables
}