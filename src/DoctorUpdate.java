/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tashfiq
 */
public class DoctorUpdate extends javax.swing.JFrame {

    /**
     * Creates new form DoctorUpdate
     */
    
    String userId,userEmail;
    
    public DoctorUpdate(String _docId, String _docEmail) {
        initComponents();
        
        nameField.setBackground(new Color(0,0,0,0));
        emailField.setBackground(new Color(0,0,0,0));
        contactNumberField.setBackground(new Color(0,0,0,0));
        specField.setBackground(new Color(0,0,0,0));
        passField.setBackground(new Color(0,0,0,0));
        confirmPassField.setBackground(new Color(0,0,0,0)); 
        DoctorUpdateButton.setBackground(new Color(0,0,0,0)); 
        DoctorUpdateBackButton.setBackground(new Color(0,0,0,0));
        
        userId = _docId;
        userEmail = _docEmail;
        
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
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        contactNumberField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        specField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        DoctorUpdateButton = new javax.swing.JButton();
        DoctorUpdateBackButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        passErrorText = new javax.swing.JLabel();
        emailErrorText = new javax.swing.JLabel();
        nameErrorText = new javax.swing.JLabel();
        specErrorText = new javax.swing.JLabel();
        contactErrorText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("U P D A T E       I N F O R M A T I O N");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 230, 30));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 0, 0));
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 30));

        nameField.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 51, 51));
        nameField.setText("Enter Full Name");
        nameField.setBorder(null);
        nameField.setOpaque(false);
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, 30));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(38, 0, 0));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 30));

        emailField.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        emailField.setForeground(new java.awt.Color(0, 51, 51));
        emailField.setText("Enter Email");
        emailField.setBorder(null);
        emailField.setOpaque(false);
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
        });
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, 30));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(38, 0, 0));
        jLabel12.setText("Contact Number");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 190, 30));

        contactNumberField.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        contactNumberField.setForeground(new java.awt.Color(0, 51, 51));
        contactNumberField.setText("Enter Contact Number");
        contactNumberField.setBorder(null);
        contactNumberField.setOpaque(false);
        contactNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactNumberFieldFocusGained(evt);
            }
        });
        contactNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberFieldActionPerformed(evt);
            }
        });
        jPanel1.add(contactNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 30));

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(38, 0, 0));
        jLabel13.setText("Speciality");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 190, 30));

        specField.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        specField.setForeground(new java.awt.Color(0, 51, 51));
        specField.setText("Enter Speciality");
        specField.setBorder(null);
        specField.setOpaque(false);
        specField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                specFieldFocusGained(evt);
            }
        });
        specField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specFieldActionPerformed(evt);
            }
        });
        jPanel1.add(specField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 30));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(38, 0, 0));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 190, 30));

        passField.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        passField.setForeground(new java.awt.Color(51, 51, 51));
        passField.setText("EnterPassword");
        passField.setBorder(null);
        passField.setOpaque(false);
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
        });
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 230, 30));

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(38, 0, 0));
        jLabel15.setText("Confirm Password");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 190, 30));

        confirmPassField.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        confirmPassField.setForeground(new java.awt.Color(51, 51, 51));
        confirmPassField.setText("EnterPassword");
        confirmPassField.setBorder(null);
        confirmPassField.setOpaque(false);
        confirmPassField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmPassFieldFocusGained(evt);
            }
        });
        confirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassFieldActionPerformed(evt);
            }
        });
        jPanel1.add(confirmPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 230, 30));

        DoctorUpdateButton.setBackground(new java.awt.Color(36, 33, 44));
        DoctorUpdateButton.setForeground(new java.awt.Color(36, 33, 44));
        DoctorUpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/update.png"))); // NOI18N
        DoctorUpdateButton.setBorder(null);
        DoctorUpdateButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DoctorUpdateButtonFocusGained(evt);
            }
        });
        DoctorUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorUpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorUpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 100, 40));

        DoctorUpdateBackButton.setBackground(new java.awt.Color(36, 33, 44));
        DoctorUpdateBackButton.setForeground(new java.awt.Color(36, 33, 44));
        DoctorUpdateBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/back2.png"))); // NOI18N
        DoctorUpdateBackButton.setBorder(null);
        DoctorUpdateBackButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DoctorUpdateBackButtonFocusGained(evt);
            }
        });
        DoctorUpdateBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorUpdateBackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorUpdateBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 100, 40));

        jSeparator2.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 260, 2));

        jSeparator3.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(51, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 260, 2));

        jSeparator1.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 260, 2));

        jSeparator6.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(51, 0, 0));
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 260, 2));

        jSeparator5.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(51, 0, 0));
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 2));

        jSeparator4.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(51, 0, 0));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0)));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 260, 2));

        passErrorText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passErrorText.setText("pass error");
        jPanel1.add(passErrorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 230, 20));

        emailErrorText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailErrorText.setText("mail Error ");
        jPanel1.add(emailErrorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 230, 20));

        nameErrorText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameErrorText.setText("name Error ");
        jPanel1.add(nameErrorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 104, 230, 20));

        specErrorText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        specErrorText.setText("spec error");
        jPanel1.add(specErrorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 230, 20));

        contactErrorText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        contactErrorText.setText("contact Errorr ");
        jPanel1.add(contactErrorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 230, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/b4.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        // TODO add your handling code here:
        nameField.setText("");
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldFocusLost

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        // TODO add your handling code here:
        emailField.setText("");
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void contactNumberFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNumberFieldFocusGained
        // TODO add your handling code here:
        contactNumberField.setText("");
    }//GEN-LAST:event_contactNumberFieldFocusGained

    private void contactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberFieldActionPerformed

    private void specFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_specFieldFocusGained
        // TODO add your handling code here:
        specField.setText("");
    }//GEN-LAST:event_specFieldFocusGained

    private void specFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specFieldActionPerformed

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        // TODO add your handling code here:
        passField.setText("");
    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void confirmPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPassFieldFocusGained
        // TODO add your handling code here:
        confirmPassField.setText("");
    }//GEN-LAST:event_confirmPassFieldFocusGained

    private void confirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassFieldActionPerformed

    private void DoctorUpdateButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoctorUpdateButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorUpdateButtonFocusGained

    private void DoctorUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorUpdateButtonActionPerformed
        // TODO add your handling code here:
        String name,email,contactNumber,spec,pass;
        
        if (!nameField.getText().trim().isEmpty() && !nameField.getText().trim().equals("Enter Full Name")) {
            name = nameField.getText().trim();
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                Statement statement = connection.createStatement();

                statement.executeUpdate("Update DOCTOR set doctorName=\'" + name + "\' where doctorId=" + userId);
                
                nameErrorText.setForeground(new Color(0, 255, 0, 255));
                nameErrorText.setText("Updated Name Successfully!!!");
            } catch (Exception ex) {
                Logger.getLogger(DoctorUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (!specField.getText().trim().isEmpty() && !specField.getText().trim().equals("Enter Speciality")) {
            spec = specField.getText().trim();
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                Statement statement = connection.createStatement();

                statement.executeUpdate("Update DOCTOR set Speciality=\'" + spec + "\' where doctorId=" + userId);
                
                specErrorText.setForeground(new Color(0, 255, 0, 255));
                specErrorText.setText("Updated Speciality Successfully!!!");
            } catch (Exception ex) {
                Logger.getLogger(DoctorUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (!String.valueOf(passField.getPassword()).isEmpty() && !String.valueOf(passField.getPassword()).equals("EnterPassword")) 
        {
            if (String.valueOf(passField.getPassword()).equals(String.valueOf(confirmPassField.getPassword()))) {
                pass = String.valueOf(passField.getPassword());
                try {

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection connection = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                    Statement statement = connection.createStatement();

                    statement.executeUpdate("Update DOCTOR set DoctorPassword=\'" + pass + "\' where DoctorId=" + userId);
                    
                    passErrorText.setForeground(new Color(0, 255, 0, 255));
                    passErrorText.setText("Updated Password Successfully!!!");
                } catch (Exception ex) {
                    Logger.getLogger(DoctorUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else 
            {
                passErrorText.setForeground(new Color(255, 0, 0, 255));
                passErrorText.setText("Password Update Not Successful!!!");
            }
        }
        
        if (!contactNumberField.getText().trim().isEmpty() && !contactNumberField.getText().trim().equals("Enter Contact Number")) {
            contactNumber = contactNumberField.getText().trim();
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                Statement statement = connection.createStatement();
                ResultSet tempSet = statement.executeQuery("select * from DOCTOR where DoctorContactNumber=\'" + contactNumber+"\'");
                
                while(tempSet.next()){};

                if (tempSet.getRow() == 0) // if value is 0 then update
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection connection2 = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                    Statement statement2 = connection2.createStatement();
                    
                    statement2.executeUpdate("Update DOCTOR set DoctorContactNumber=\'" + contactNumber + "\' where DoctorId=" + userId);
                    contactErrorText.setForeground(new Color(0, 255, 0, 255));
                    contactErrorText.setText("Updated Contact Number Successfully!!!");
                } else {
                    contactErrorText.setForeground(new Color(255, 0, 0, 255));
                    contactErrorText.setText("This Contact Number Already Exists!!!");
                }

            } catch (Exception ex) {
                Logger.getLogger(DoctorUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (!emailField.getText().trim().toLowerCase().isEmpty() && !emailField.getText().trim().equals("Enter Email")) {
            email = emailField.getText().trim().toLowerCase();
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                Statement statement = connection.createStatement();
                ResultSet tempSet = statement.executeQuery("select * from DOCTOR where DoctorEmail=\'" + email + "\'");
                
                while(tempSet.next()){};
                
                if (tempSet.getRow() == 0) // if value is 0 then update
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection connection2 = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                    Statement statement2 = connection2.createStatement();

                    statement2.executeUpdate("Update DOCTOR set DoctorEmail=\'" + email + "\' where DoctorId=" + userId);
                    userEmail=email;
                    
                    emailErrorText.setForeground(new Color(0, 255, 0, 255));
                    emailErrorText.setText("Updated Email Successfully!!!");
                }
                else 
                {
                    emailErrorText.setForeground(new Color(255, 0, 0, 255));
                    emailErrorText.setText("This Email Already Exists!!!");
                }
            } catch (Exception ex) {
                Logger.getLogger(DoctorUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_DoctorUpdateButtonActionPerformed

    public static void createForm(String _docId, String _docEmail)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorUpdate(_docId,_docEmail).setVisible(true);
            }
        });
        
    }
    
    private void DoctorUpdateBackButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoctorUpdateBackButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorUpdateBackButtonFocusGained

    private void DoctorUpdateBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorUpdateBackButtonActionPerformed
        // TODO add your handling code here:
        
        DoctorAccount.createForm(userEmail);
        this.dispose();
    }//GEN-LAST:event_DoctorUpdateBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorUpdate().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoctorUpdateBackButton;
    private javax.swing.JButton DoctorUpdateButton;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel contactErrorText;
    private javax.swing.JTextField contactNumberField;
    private javax.swing.JLabel emailErrorText;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nameErrorText;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel passErrorText;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel specErrorText;
    private javax.swing.JTextField specField;
    // End of variables declaration//GEN-END:variables
}
