
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectMSSQL {

    public Connection connection;
    public ArrayList<ArrayList<String>> q_data = new ArrayList<ArrayList<String>>();
    public ArrayList<String> q_label = new ArrayList<String>();
    public ArrayList<String> x = new ArrayList<String>();
    public ResultSet resultSet;
    public ArrayList<String> patPrescriptionIdList = new ArrayList<String>();
    public ArrayList<String> docPrescriptionIdList = new ArrayList<String>();

    public void adminQ(String s) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(s);

            int number_of_column = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= number_of_column; i++) {
                q_label.add(resultSet.getMetaData().getColumnName(i));
            }
            while (resultSet.next()) {
                x = new ArrayList<String>();
                for (int i = 1; i <= number_of_column; i++) {
                    x.add(resultSet.getString(i));
                }
                q_data.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void patientAuth() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select patientEmail,patientPassword from PATIENT");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getPatData(String patEmail) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from PATIENT where patientEmail=\'" + patEmail + "\'");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getPatPrescriptionData(String patId) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            //resultSet = statement.executeQuery("select PrescriptionId,DoctorId,PrescriptionDate from PRESCRIPTION where PatientId=\'" + patId + "\' order by PrescriptionDate");
            resultSet = statement.executeQuery("select PRESCRIPTION.PrescriptionId,Doctor.DoctorName,Doctor.Speciality,"
                    + "Prescription.Disease,PRESCRIPTION.PrescriptionDate from PRESCRIPTION full join Doctor"
                    + " on PRESCRIPTION.DoctorId=Doctor.DoctorId where PatientId=\'"+patId+"\' order by PrescriptionDate");    
            
            int number_of_column = resultSet.getMetaData().getColumnCount();
            
            for (int i = 2; i <= number_of_column; i++) {
                q_label.add(resultSet.getMetaData().getColumnName(i));
            }
            
            while (resultSet.next()) {
                x = new ArrayList<String>();
                for (int i = 1; i <= number_of_column; i++) {
                    if(i==1)
                        patPrescriptionIdList.add(resultSet.getString(i));
                    else 
                        x.add(resultSet.getString(i));
                }
                q_data.add(x);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doctorAuth() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select doctorEmail,doctorPassword from DOCTOR");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getDocData(String docEmail) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from DOCTOR where doctorEmail=\'" + docEmail + "\'");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getDocPrescriptionData(String docId) {
        try {   
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
             
            resultSet = statement.executeQuery("select PRESCRIPTION.PrescriptionId,PATIENT.PatientName,Prescription.Disease, "
                    + "PRESCRIPTION.PrescriptionDate from PRESCRIPTION full join Patient on "
                    +"  PRESCRIPTION.PatientId=Patient.PatientId where DoctorId= \'"+docId+"\' order by PrescriptionDate");
            
            
            int number_of_column = resultSet.getMetaData().getColumnCount();
            
            for (int i = 2; i <= number_of_column; i++) {
                q_label.add(resultSet.getMetaData().getColumnName(i));
            }
            
            while (resultSet.next()) {
                x = new ArrayList<String>();
                for (int i = 1; i <= number_of_column; i++) {
                    if(i==1)
                        docPrescriptionIdList.add(resultSet.getString(i));
                    else 
                        x.add(resultSet.getString(i));
                }
                q_data.add(x);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public void getPrescriptionData(String prescId)
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from PRESCRIPTION where prescriptionId=\'" + prescId + "\'");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {

    }

}
