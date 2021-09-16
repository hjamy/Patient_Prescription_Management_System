/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tashfiq
 */
public class SignUpPatient extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPatient
     */
    Connection connection, connection2;
    Statement statement, statement2;
    ResultSet resultSet;

    public SignUpPatient() {
        initComponents();

        nameField.setBackground(new Color(0, 0, 0, 0));
        passField.setBackground(new Color(0, 0, 0, 0));
        contactNumberField.setBackground(new Color(0, 0, 0, 0));
        emailField.setBackground(new Color(0, 0, 0, 0));
        //PatientDateofBirthTextField.setBackground(new Color(0,0,0,0));
        confirmPassField.setBackground(new Color(0, 0, 0, 0));
        PatientSignUpButton.setBackground(new Color(0, 0, 0, 0));
        PatientSignUpBackButton.setBackground(new Color(0, 0, 0, 0));

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(Locale.US);
        //LocalDate date = LocalDate.parse("1960-01-15", formatter);
        jDateChooser.setDate(Date.valueOf(LocalDate.parse("1900-01-15", DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(Locale.US))));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderbuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        femaleRadButton = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        PatientSignUpBackButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        PatientSignUpButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        contactNumberField = new javax.swing.JTextField();
        maleRadButton = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        errorText = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailField.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        emailField.setForeground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 230, 30));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 260, 10));

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Date of Birth");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 255, 190, 30));

        confirmPassField.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        confirmPassField.setForeground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(confirmPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 385, 230, 30));

        jLabel16.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("IT'S COMPLETELY FREE");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 240, 30));

        passField.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        passField.setForeground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 230, 30));

        femaleRadButton.setBackground(new java.awt.Color(18, 36, 56));
        GenderbuttonGroup.add(femaleRadButton);
        femaleRadButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        femaleRadButton.setForeground(new java.awt.Color(255, 255, 255));
        femaleRadButton.setText("Female");
        jPanel1.add(femaleRadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 435, -1, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("R E G I S T E R");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 140, 30));

        PatientSignUpBackButton.setBackground(new java.awt.Color(36, 33, 44));
        PatientSignUpBackButton.setForeground(new java.awt.Color(36, 33, 44));
        PatientSignUpBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/back2.png"))); // NOI18N
        PatientSignUpBackButton.setBorder(null);
        PatientSignUpBackButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PatientSignUpBackButtonFocusGained(evt);
            }
        });
        PatientSignUpBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientSignUpBackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PatientSignUpBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 90, 30));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Confirm Password");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 365, 190, 30));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator8.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 260, 5));

        jLabel25.setBackground(new java.awt.Color(153, 153, 153));
        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Gender");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 40, 30));

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Password");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 190, 30));

        PatientSignUpButton.setBackground(new java.awt.Color(36, 33, 44));
        PatientSignUpButton.setForeground(new java.awt.Color(36, 33, 44));
        PatientSignUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/Sign up.png"))); // NOI18N
        PatientSignUpButton.setBorder(null);
        PatientSignUpButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PatientSignUpButtonFocusGained(evt);
            }
        });
        PatientSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientSignUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PatientSignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 90, 30));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 260, 5));

        jLabel21.setBackground(new java.awt.Color(153, 153, 153));
        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Contact Number");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 190, 30));

        contactNumberField.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        contactNumberField.setForeground(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(contactNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 230, 30));

        maleRadButton.setBackground(new java.awt.Color(18, 36, 56));
        GenderbuttonGroup.add(maleRadButton);
        maleRadButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        maleRadButton.setForeground(new java.awt.Color(255, 255, 255));
        maleRadButton.setText("Male");
        maleRadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(maleRadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 435, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 195, 260, 10));

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 145, 190, 30));

        nameField.setFont(new java.awt.Font("Berlin Sans FB", 0, 10)); // NOI18N
        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setBorder(null);
        nameField.setOpaque(false);
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 230, 30));

        jLabel19.setBackground(new java.awt.Color(153, 153, 153));
        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Full Name");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 190, 30));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 415, 260, 10));
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 260, -1));

        errorText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorText.setForeground(new java.awt.Color(255, 255, 255));
        errorText.setText("Error Field");
        jPanel1.add(errorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 260, 40));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/b1.jpg"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 590));

        jLabel18.setBackground(new java.awt.Color(36, 33, 44));
        jLabel18.setForeground(new java.awt.Color(36, 33, 44));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/b2.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 350, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void confirmPassFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmPassFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassFieldFocusGained

    private void confirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassFieldActionPerformed

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void PatientSignUpBackButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PatientSignUpBackButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientSignUpBackButtonFocusGained

    private void PatientSignUpBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientSignUpBackButtonActionPerformed
        // TODO add your handling code here:
        Menu.main(null);
        this.dispose();
    }//GEN-LAST:event_PatientSignUpBackButtonActionPerformed

    private void PatientSignUpButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PatientSignUpButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientSignUpButtonFocusGained

    private void PatientSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientSignUpButtonActionPerformed
        // TODO add your handling code here:
        String name, email, contact, pass, confirmPass, dob;
        String gender;
        name = nameField.getText().trim();
        email = emailField.getText().trim().toLowerCase();
        contact = contactNumberField.getText().trim();
        pass = String.valueOf(passField.getPassword());
        confirmPass = String.valueOf(confirmPassField.getPassword());
        dob = new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser.getDate());
        errorText.setForeground(new Color(255, 0, 0, 255));
        int f1 = 1;
        int f2 = 1;
        System.out.println("hit");

        if (name.isEmpty() || email.isEmpty() || contact.isEmpty() || pass.isEmpty() || confirmPass.isEmpty() || dob.equals("1900-01-15") || 
                !(maleRadButton.isSelected() || femaleRadButton.isSelected())) 
        {
            errorText.setText("Please Fill Up All Fields!!!");
        }
        else{
            if (maleRadButton.isSelected()) {
                System.out.println("hit");
                gender = "Male";
            } else {
                System.out.println("hit2");
                gender = "Female";
            }

            if (pass.equals(confirmPass)) {
                System.out.println("hit3");
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    connection = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                    statement = connection.createStatement();
                    
                    String q = "select * from PATIENT where patientContactNumber=\'" + contact + "\'";
                    System.out.println(q);
                    resultSet = statement.executeQuery(q);
                    
                    System.out.println(resultSet.getRow());

                    while (resultSet.next()) {
                    };
                    //System.out.println(resultSet.getString("PatientContactNumber"));

                    if (resultSet.getRow() != 0) // if value is 0 then update
                    {
                        f1 = 0;
                    }
                } catch (Exception ex) {
                    Logger.getLogger(PatientUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    connection = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
                    statement = connection.createStatement();
                    String q = "select * from PATIENT where patientEmail=\'" + email + "\'";
                    System.out.println(q);
                    resultSet = statement.executeQuery(q);

                    while (resultSet.next()) {
                    };
                    
                    System.out.println(resultSet.getRow());

                    if (resultSet.getRow() != 0) // if value is 0 then update
                    {
                        f2=0;
                    } 
                } catch (Exception ex) {
                    Logger.getLogger(PatientUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(f1==0 && f2==0)
                    errorText.setText("Email and Contact number Already Exists!!!");
                else if(f1==0)
                    errorText.setText("Contact number Already Exists!!!");
                else if(f2==0)
                    errorText.setText("Email Already Exists!!!");
                
                    
            } //end of my story

        }

    }//GEN-LAST:event_PatientSignUpButtonActionPerformed

    private void contactNumberFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNumberFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberFieldFocusGained

    private void contactNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberFieldActionPerformed

    private void maleRadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadButtonActionPerformed

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GenderbuttonGroup;
    private javax.swing.JButton PatientSignUpBackButton;
    private javax.swing.JButton PatientSignUpButton;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JTextField contactNumberField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel errorText;
    private javax.swing.JRadioButton femaleRadButton;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JRadioButton maleRadButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    // End of variables declaration//GEN-END:variables
}
