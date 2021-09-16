/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Acer
 */
public class PrescribedPrescription extends javax.swing.JFrame {

    /**
     * Creates new form PrescribedPrescription
     */
    Connection connection;
    ResultSet resultSet;
    Statement statement;
    
    String prescId,accType,userEmail;
    ConnectMSSQL cnObj;
    String docId,patId,disease,advice,symptoms,prescDate;

    
    public PrescribedPrescription(String _prescriptionId,String _accType,String _userEmail) {
        initComponents();
        
        presBackButton.setBackground(new Color(0,0,0,0));
        prescId = _prescriptionId;
        accType=_accType;
        userEmail=_userEmail;
        
        try {
            //get all prescription data
            cnObj = new ConnectMSSQL();
            cnObj.getPrescriptionData(prescId);
            cnObj.resultSet.next();
            
            docId = cnObj.resultSet.getString("DoctorId");
            patId = cnObj.resultSet.getString("PatientId");
            disease = cnObj.resultSet.getString("Disease");
            advice = cnObj.resultSet.getString("DoctorAdvice");
            symptoms = cnObj.resultSet.getString("Symptoms");
            prescDate = cnObj.resultSet.getString("PrescriptionDate");
            
            // get all doc data 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from DOCTOR where DoctorId=\'" + docId + "\'");
            
            resultSet.next();
            docNameLabel.setText(resultSet.getString("DoctorName"));
            docSpecLabel.setText(resultSet.getString("Speciality"));
            docContactLabel.setText(resultSet.getString("DoctorContactNumber"));
            docEmailLabel.setText(resultSet.getString("DoctorEmail"));
            
            //get all pat data
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from PATIENT where PatientId=\'" + patId + "\'");
            
            resultSet.next();
            
            patNameLabel.setText(resultSet.getString("PatientName"));
            String patDob=resultSet.getString("DateOfBirth");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(Locale.US);
            LocalDate date1 = LocalDate.parse(patDob, formatter);
            LocalDate date2 = LocalDate.parse(prescDate, formatter);
            int age = Period.between(date1,date2).getYears();
            patAgeLabel.setText(String.valueOf(age));
            
            //populate the prescripton part ..data we already have
            
            presDateLabel.setText("<html><p style=\"width:300px\">"+prescDate+"</p></html>");
            symptomLabel.setText("<html><p style=\"width:300px\">"+symptoms+"</p></html>");
            diseaseLabel.setText("<html><p style=\"width:300px\">"+disease+"</p></html>");
            adviceLabel.setText("<html><p style=\"width:300px\">"+advice+"</p></html>");
            
            //get list of medicine to show
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select distinct MedicineName from MEDICINE_DETAIL where MedicineId IN  "
                    + "(select MedicineId from PRESCRIBED_MEDICINE_LIST where PrescriptionId= \'"+prescId+"\' )");
            
            resultSet.next();
            String medList =  resultSet.getString("MedicineName");
            while(resultSet.next())
            {
                medList=medList + ", "+resultSet.getString("MedicineName");
            }
            
            medicineLabel.setText("<html><p style=\"width:300px\">"+medList+"</p></html>");
            
            //get list of all test to show
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select distinct TestName from TEST_DETAIL where TestId IN  "
                    + "(select TestId from PRESCRIBED_Test_LIST where PrescriptionId= \'"+prescId+"\')");
            
            resultSet.next();
            String testList = resultSet.getString("TestName");
            while(resultSet.next())
            {
                testList=testList + ", "+resultSet.getString("TestName");
            }
            
            testLabel.setText("<html><p style=\"width:300px\">"+testList+"</p></html>");
            
        } catch (Exception ex) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        docEmailLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        docSpecLabel = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        docNameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        docContactLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        patAgeLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        patNameLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        presDateLabel = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        testLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        adviceLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicineLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        diseaseLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        symptomLabel = new javax.swing.JLabel();
        presBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 1200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/log1.png"))); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 120));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 120));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("NAME");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 40, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("CONTACT NUMBER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 880, 10));

        jSeparator5.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 260, 2));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("EMAIL");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 30, 20));

        docEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(docEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 200, 20));

        jSeparator8.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 200, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("SPECIALITY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 60, 20));

        docSpecLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(docSpecLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 170, 20));

        jSeparator7.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 40, 20));

        docNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(docNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 250, 20));

        jSeparator1.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 250, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Patient");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        docContactLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(docContactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 185, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Doctor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 150, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 880, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PPMS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        patAgeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(patAgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 270, 20));

        jSeparator2.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 185, 2));

        jSeparator4.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 270, 2));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("AGE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        patNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(patNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 260, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PPMS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Prescription");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setText("DATE");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 30, 20));

        presDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(presDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 100, 20));

        jSeparator9.setBackground(new java.awt.Color(51, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(51, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 100, 2));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel25.setText("TESTS : ");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 70, 20));

        testLabel.setBackground(new java.awt.Color(255, 255, 255));
        testLabel.setText("jLabel12");
        testLabel.setOpaque(true);
        jScrollPane6.setViewportView(testLabel);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 990, 400, 120));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setText("DOCTOR ADVICE : ");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 870, 100, 20));

        adviceLabel.setBackground(new java.awt.Color(255, 255, 255));
        adviceLabel.setText("jLabel11");
        adviceLabel.setOpaque(true);
        jScrollPane5.setViewportView(adviceLabel);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 830, 400, 120));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel23.setText("MEDICINE : ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 70, 20));

        medicineLabel.setBackground(new java.awt.Color(255, 255, 255));
        medicineLabel.setText("jLabel6");
        medicineLabel.setOpaque(true);
        jScrollPane4.setViewportView(medicineLabel);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 680, 400, 120));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setText("DISEASE : ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 70, 20));

        diseaseLabel.setBackground(new java.awt.Color(255, 255, 255));
        diseaseLabel.setText("jLabel4");
        diseaseLabel.setOpaque(true);
        jScrollPane3.setViewportView(diseaseLabel);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 400, 120));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setText("SYMPTOMS :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 70, 20));

        symptomLabel.setBackground(new java.awt.Color(255, 255, 255));
        symptomLabel.setText("jLabel1");
        symptomLabel.setOpaque(true);
        jScrollPane2.setViewportView(symptomLabel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 400, 120));

        presBackButton.setBackground(new java.awt.Color(36, 33, 44));
        presBackButton.setForeground(new java.awt.Color(36, 33, 44));
        presBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectImages/back2.png"))); // NOI18N
        presBackButton.setBorder(null);
        presBackButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                presBackButtonFocusGained(evt);
            }
        });
        presBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presBackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(presBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 1120, 100, 40));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void presBackButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_presBackButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_presBackButtonFocusGained

    private void presBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presBackButtonActionPerformed
        // TODO add your handling code here:
        if(accType=="pat")
        {
            PatientAccount.createForm(userEmail);
            this.dispose();
        }
        else 
        {
            DoctorAccount.createForm(userEmail);
            this.dispose();
        }
    }//GEN-LAST:event_presBackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void createForm(String _prescriptionId,String _accType,String _userEmail)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescribedPrescription(_prescriptionId,_accType,_userEmail).setVisible(true);
            }
        });
    }
    
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
            java.util.logging.Logger.getLogger(PrescribedPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescribedPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescribedPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescribedPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescribedPrescription().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adviceLabel;
    private javax.swing.JLabel diseaseLabel;
    private javax.swing.JLabel docContactLabel;
    private javax.swing.JLabel docEmailLabel;
    private javax.swing.JLabel docNameLabel;
    private javax.swing.JLabel docSpecLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel medicineLabel;
    private javax.swing.JLabel patAgeLabel;
    private javax.swing.JLabel patNameLabel;
    private javax.swing.JButton presBackButton;
    private javax.swing.JLabel presDateLabel;
    private javax.swing.JLabel symptomLabel;
    private javax.swing.JLabel testLabel;
    // End of variables declaration//GEN-END:variables
}
