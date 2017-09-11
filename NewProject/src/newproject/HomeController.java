
package newproject;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import java.sql.*;

public class HomeController  implements Initializable{
    
    public static List<Stage>stageval = new ArrayList<Stage>();
    public static List<String>fxmlval = new ArrayList<String>();
       
    @FXML
     private TextField login1 ;
    @FXML
     private PasswordField login2 ;
    @FXML
     private Label lab1 ;
    @FXML
    private Button btn1, apointment, register1, donateB, patientsearch, submitReview ;
    @FXML
       private RadioButton r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20;
        @FXML
       private RadioButton r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40;
        @FXML
       private RadioButton r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56;
       @FXML
       public ComboBox<String> reviewCombo;
       
       int total;
       String DoctorName;
       
       ObservableList<String> list = FXCollections.observableArrayList("DR. RAYMOND SMITH", "DR. ABAYO TESLER", "DR. TILLER MNES", "DR. RICHEARD MAN", "DR. MISTER AYO", "DR. KOLE ADEMI");
       
      
    public void initializer(ActionEvent event) {
        reviewCombo.getItems().removeAll(list);
        reviewCombo.getItems().addAll("DR. RAYMOND SMITH", "DR. ABAYO TESLER", "DR. TILLER MNES", "DR. RICHEARD MAN", "DR. MISTER AYO", "DR. KOLE ADEMI");
        reviewCombo.getSelectionModel().selectFirst();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }
    
    public void reviewComboPressed(ActionEvent event){
        DoctorName = reviewCombo.getValue();
    }
    public void btn1Pressed(ActionEvent event) throws IOException{
        //stage.close();
        if (login1.getText().equals("") && login2.getText().equals("")){
        Stage stage =  (Stage) btn1.getScene().getWindow();
        
        //Stage stage21 = new Stage();
        stage.setTitle("HOME PAGE");
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        fxmlval.add("Home.fxml");
        stageval.add((Stage) btn1.getScene().getWindow());
        Scene scene1 = new Scene(root, 1350, 760);
       // scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
        
        }
        else {
            login1.setText("");
            login2.setText("");
            lab1.setText("Invalid Password or Firstname!! ");
        }
    }
    
    public void appointmentbtn(ActionEvent event) throws IOException {
        Stage stage = (Stage) apointment.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("appointment.fxml"));
        
        Scene scene1 = new Scene(root);
        fxmlval.add("appointment.fxml");
        stageval.add((Stage) apointment.getScene().getWindow());
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("APPOINTMENT");
        stage.show();
    }
    
    public void registrationbtn(ActionEvent event) throws IOException{
        Stage stage = (Stage) register1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Registratn.fxml"));
        fxmlval.add("Registratn.fxml");
        stageval.add((Stage) register1.getScene().getWindow());
        
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("REGISTRATION");
        stage.show();
    }
    
     public void management(ActionEvent event) throws IOException{
        Stage stage = (Stage) donateB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("patientsearch.fxml"));
        fxmlval.add("patientsearch.fxml");
        stageval.add(stage);
        
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("MANAGEMENT");
        stage.show();
    }
     
     public void reviewDoc(ActionEvent event) throws IOException{
        Stage stage = (Stage) donateB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("docReview.fxml"));
        fxmlval.add("docReview.fxml");
        stageval.add(stage);
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("DOCTOR'S REVIEW");
        stage.show();
    }
     
     public void billingSys(ActionEvent event) throws IOException{
        Stage stage = (Stage) donateB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("billingSys.fxml"));
        fxmlval.add("billingSys.fxml");
        stageval.add(stage);
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("BILLING");
        stage.show();
    }
     
     
     public void donateBlood(ActionEvent event) throws IOException{
        Stage stage = (Stage) donateB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("bloodDonate.fxml"));
        fxmlval.add("bloodDonate.fxml");
        stageval.add(stage);
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("DONATE BLOOD");
        stage.show();
    }
     
     
     
      
       public void nurses(ActionEvent event) throws IOException{
        Stage stage = (Stage) donateB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("employeedata.fxml"));
        fxmlval.add("employeedata.fxml");
        stageval.add(stage);
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("EMPLOYEE REGISTRATION");
        stage.show();
    }
       
       public void nursesdata(ActionEvent event) throws IOException{
        Stage stage = (Stage) donateB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("employee.fxml"));
        fxmlval.add("employee.fxml");
        stageval.add(stage);
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("EMPLOYEE REGISTRATION");
        stage.show();
    }
    
       public void radioPressed(ActionEvent event){
           docRevSys(r1, r2, r3, r4);
           int ra = docRevSys(r1, r2, r3, r4);
           
           docRevSys(r5, r6, r7, r8);
           int rb = docRevSys(r5, r6, r7, r8);
           
           docRevSys(r9, r10, r11, r12);
           int rc = docRevSys(r9, r10, r11, r12);
           
           docRevSys(r13, r14, r15, r16);
           int rd = docRevSys(r13, r14, r15, r16);
           
           docRevSys(r17, r18, r19, r20);
           int rf = docRevSys(r17, r18, r19, r20);
           
           docRevSys( r21, r22, r23, r24);
           int rg = docRevSys( r21, r22, r23, r24);
           
           docRevSys(r25, r26, r27, r28);
           int ri = docRevSys(r25, r26, r27, r28);
           
           docRevSys(r29, r30, r31, r32);
           int rj = docRevSys(r29, r30, r31, r32);
           
           docRevSys(r33, r34, r35, r36);
           int rk = docRevSys(r33, r34, r35, r36);
           
           docRevSys(r37, r38, r39, r40);
           int rl = docRevSys(r37, r38, r39, r40);
           
           docRevSys(r41, r42, r43, r44);
           int rm = docRevSys(r41, r42, r43, r44);
           
           docRevSys(r45, r46, r47, r48);
           int rn = docRevSys(r45, r46, r47, r48);
           
           docRevSys(r49, r50, r51, r52);
           int ro = docRevSys(r49, r50, r51, r52);
           
           docRevSys(r53, r54, r55, r56);
           int rp = docRevSys(r53, r54, r55, r56);
           
           total = ra + rb + rc + rd + rf + rg  + ri + rj + rk + rl + rm + rn + ro + rp;
       }
       
       
       public  int docRevSys(RadioButton a, RadioButton b, RadioButton c, RadioButton d){
           int valu = 0;          
           final ToggleGroup group = new ToggleGroup();
           
           a.setToggleGroup(group);
           b.setToggleGroup(group);
           c.setToggleGroup(group);
           d.setToggleGroup(group);
           
           if(a.isSelected()){
           valu = 1;
           }
           else if(b.isSelected()){
           valu = 2;
           }
           else if(c.isSelected()){
           valu = 3;
           }
           else if(d.isSelected()){
           valu = 4;
           }
       
           return valu;
       }
       
         @FXML
    public void submitBack(ActionEvent event) throws IOException{
        
        
                
       BackButton bb = new BackButton();
       bb.back(fxmlval.get(fxmlval.size() - 1), stageval.get(stageval.size() -1));
       fxmlval.remove(fxmlval.size() - 1);
       stageval.remove(stageval.size() - 1);
       
    }
       public void submitBackReview(ActionEvent event) throws IOException{
           
           
                
       BackButton bb = new BackButton();
       bb.back(fxmlval.get(fxmlval.size() - 1), stageval.get(stageval.size() -1));
       fxmlval.remove(fxmlval.size() - 1);
       stageval.remove(stageval.size() - 1);
       
    }
       
       @FXML
    private void back(ActionEvent event) throws IOException{
                
       BackButton bb = new BackButton();
       bb.back(fxmlval.get(fxmlval.size() - 1), stageval.get(stageval.size() -1));
       fxmlval.remove(fxmlval.size() - 1);
       stageval.remove(stageval.size() - 1);
    }
       
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    //             DATABASES          //
    
    
    
    @FXML 
   private TextField a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15; 
    @FXML 
   private TextField c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24;
   @FXML
    private TextField a16, a17, a18, a19, a20, a21; 
   @FXML
   private TextField b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
   @FXML
   private RadioButton b16, b17;
   @FXML
   private TextField e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11,e12, e13, e14, e15; 
   @FXML
   private TextField e16, e17, e18, e19, e20, e21, search1, search2, search3, search4, displayAmount;
   @FXML
   private TextField p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15; 
   @FXML
   private TextField m1, m2, m3, m4, m5, m6, m7, m8, m9, m11, m12, m13, m14, m15; 
   @FXML
   private TextField m16, m17, m18, m19, m20, m21, m22;
   @FXML
   private TextField g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g14, g15; 
   @FXML
   private TextField p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34; 
   @FXML
   private TextField g16, g17, g18, g19, g20, g21, g22, g23, g24, g25, g26, g27, g28, g29, g30, g31, g32, g33, g34; 
   @FXML
  
   Connection connection;
   
public void initializeDB() throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Connected");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/hospital", "root", "tope");
        System.out.println("Database Connected");
}

public void appointmentDb() throws SQLException, ClassNotFoundException{
    initializeDB();
    PreparedStatement pmt = connection.prepareStatement("INSERT INTO appointment(casetype, patient_id, firstname, surname, middlename, age, address1, address2, address3, city, taluka, states, area, pin, district, country, tel_no_Home, mob_num, tel_no_office, fax_no, email) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    
    pmt.setString(1, a1.getText());
    pmt.setString(2, a2.getText());
    pmt.setString(3, a3.getText());
    pmt.setString(4, a4.getText());
    pmt.setString(5, a5.getText());
    pmt.setString(6, a6.getText());
    pmt.setString(7, a7.getText());
    pmt.setString(8, a8.getText());
    pmt.setString(9, a9.getText());
    pmt.setString(10, a10.getText());
    pmt.setString(11, a11.getText());
    pmt.setString(12, a12.getText());
    pmt.setString(13, a13.getText());
    pmt.setString(14, a14.getText());
    pmt.setString(15, a15.getText());
    pmt.setString(16, a16.getText());
    pmt.setString(17, a17.getText());
    pmt.setString(18, a18.getText());
    pmt.setString(19, a19.getText());
    pmt.setString(20, a20.getText());
    pmt.setString(21, a21.getText());
}

public String checker(RadioButton a, RadioButton b){
           String valu = null;          
           final ToggleGroup group = new ToggleGroup();
           
           a.setToggleGroup(group);
           b.setToggleGroup(group);
           
           
           if(a.isSelected()){
           valu = "First Time Donor";
           }
           else if(b.isSelected()){
           valu = "First Time Donor";
           }
           return valu;
       }
    
 public void bloodDonateDb() throws SQLException, ClassNotFoundException{
    initializeDB();
    
    PreparedStatement pmt = connection.prepareStatement("INSERT INTO blooddonate(idcard_no, blood_group, rh, donor_number, dob, sex, telphone, email, occupation, firstname, lastname, dob, weight, height, address, donor_type) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    
    pmt.setString(1, b1.getText());
    pmt.setString(2, b2.getText());
    pmt.setString(3, b3.getText());
    pmt.setString(4, b4.getText());
    pmt.setString(5, b5.getText());
    pmt.setString(6, b6.getText());
    pmt.setString(7, b7.getText());
    pmt.setString(8, b8.getText());
    pmt.setString(9, b9.getText());
    pmt.setString(10, b10.getText());
    pmt.setString(11, b11.getText());
    pmt.setString(12, b12.getText());
    pmt.setString(13, b13.getText());
    pmt.setString(14, b14.getText());
    pmt.setString(15, b15.getText());
    pmt.setString(16, checker(b16, b17));
    
}  
 
 public void employeeDb() throws SQLException, ClassNotFoundException{
    initializeDB();
    PreparedStatement pmt = connection.prepareStatement("INSERT INTO employee(firstname, lastname, middlename, birthdate, address, gender, contact_by, ssn, email, officephone, home_loc, marital_status, race, language_, employment_status, level_, start_salary, allowances, present_salary, others_, total) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    
    pmt.setString(1, e1.getText());
    pmt.setString(2, e2.getText());
    pmt.setString(3, e3.getText());
    pmt.setString(4, e4.getText());
    pmt.setString(5, e5.getText());
    pmt.setString(6, e6.getText());
    pmt.setString(7, e7.getText());
    pmt.setString(8, e8.getText());
    pmt.setString(9, e9.getText());
    pmt.setString(10, e10.getText());
    pmt.setString(11, e11.getText());
    pmt.setString(12, e12.getText());
    pmt.setString(13, e13.getText());
    pmt.setString(14, e14.getText());
    pmt.setString(15, e15.getText());
    pmt.setString(16, e16.getText());
    pmt.setString(17, e17.getText());
    pmt.setString(18, e18.getText());
    pmt.setString(19, e19.getText());
    pmt.setString(20, e20.getText());
    pmt.setString(21, e21.getText());
}
 
 public void patientDb() throws SQLException, ClassNotFoundException{
    initializeDB();
    PreparedStatement pmt = connection.prepareStatement("INSERT INTO patient(firstname, lastname, middlename, birthdate, address, gender, ssn, email, homephone, home_loc, marital_status, race, language_, nok_fullname, nok_relationship, nok_address, nok_city, nok_state, nok_state, nok_zip, nok_homephone, nok_workphone, accident_date, accident_time, accident_type, accident_other_infos, other_information, physical_performance, vital_signs, skin, neck, heart, abdomen, pelvic_rectal, impression) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    
    pmt.setString(1, p1.getText());
    pmt.setString(2, p2.getText());
    pmt.setString(3, p3.getText());
    pmt.setString(4, p4.getText());
    pmt.setString(5, p5.getText());
    pmt.setString(6, p6.getText());
    pmt.setString(7, p7.getText());
    pmt.setString(8, p8.getText());
    pmt.setString(9, p9.getText());
    pmt.setString(10, p10.getText());
    pmt.setString(11, p11.getText());
    pmt.setString(12, p12.getText());
    pmt.setString(13, p13.getText());
    pmt.setString(14, p14.getText());
    pmt.setString(15, p15.getText());
    pmt.setString(16, p16.getText());
    pmt.setString(17, p17.getText());
    pmt.setString(18, p18.getText());
    pmt.setString(19, p19.getText());
    pmt.setString(20, p20.getText());
    pmt.setString(21, p21.getText());
    pmt.setString(22, p22.getText());
    pmt.setString(23, p23.getText());
    pmt.setString(24, p24.getText());
    pmt.setString(25, p25.getText());
    pmt.setString(26, p26.getText());
    pmt.setString(27, p27.getText());
    pmt.setString(28, p28.getText());
    pmt.setString(29, p29.getText());
    pmt.setString(30, p30.getText());
    pmt.setString(31, p31.getText());
    pmt.setString(32, p32.getText());
    pmt.setString(33, p33.getText());
    pmt.setString(34, p34.getText());
 }
 private Label  display, display2;
 
    public void getEmployeeDB(ActionEvent event) throws SQLException, ClassNotFoundException, IOException{
        
        Stage stage = (Stage) donateB.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("emplyeemana.fxml"));
        fxmlval.add("emplyeemana.fxml");
        stageval.add(stage);
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("MANAGEMENT");
        stage.show();
        initializeDB();
        
        PreparedStatement pmt = connection.prepareStatement("Select firstname, lastname, middlename, birthdate, address, gender, contact_by, ssn, email, officephone, home_loc, marital_status, race, language_, employment_status, level_, start_salary, allowances, present_salary, others_, total FROM employee WHERE firstname = ? AND lastname = ?");
        pmt.setString(1, search3.getText());
        pmt.setString(2, search4.getText());
        ResultSet rst = pmt.executeQuery();
        
        if(rst.next()){
            String j1 = rst.getString(1);
            String j2 = rst.getString(2);
            String j3 = rst.getString(3);
            String j4 = rst.getString(4);
            String j5 = rst.getString(5);
            String j6 = rst.getString(6);
            String j7 = rst.getString(7);
            String j8 = rst.getString(8);
            String j9 = rst.getString(9);
            String j10 = rst.getString(10);
            String j11 = rst.getString(11);
            String j12 = rst.getString(12);
            String j13 = rst.getString(13);
            String j14 = rst.getString(14);
            String j15 = rst.getString(15);
            String j16 = rst.getString(16);
            String j17 = rst.getString(17);
            String j18 = rst.getString(18);
            String j19 = rst.getString(19);
            String j20 = rst.getString(20);
            String j21 = rst.getString(21);
            
            m1.setText(j1);
            m2.setText(j2);
            m3.setText(j3);
            m4.setText(j4);
            m5.setText(j5);
            m6.setText(j6);
            m7.setText(j7);
            m8.setText(j8);
            m9.setText(j9);
            m11.setText(j10);
            m12.setText(j11);
            m13.setText(j12);
            m14.setText(j13);
            m15.setText(j14);
            m16.setText(j15);
            m17.setText(j16);
            m18.setText(j17);
            m19.setText(j18);
            m20.setText(j19);
            m21.setText(j20);
            m22.setText(j21);
        }   
        else{
            display.setText("INVALID FIRSTNAME OR LASTNAME");
        }
    
    }
    
    public void getPatientDB(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
        
        Stage stage = (Stage) patientsearch.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("management.fxml"));
        fxmlval.add("management.fxml");
        stageval.add(stage);
        
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("home.css").toExternalForm());
        stage.setScene(scene1);
        stage.setTitle("MANAGEMENT");
        stage.show();
        
       initializeDB();
        PreparedStatement pmt = connection.prepareStatement("Select firstname, lastname, middlename, birthdate, address, gender, ssn, email, homephone, home_loc, marital_status, race, language_, nok_fullname, nok_relationship, nok_address, nok_city, nok_state, nok_state, nok_zip, nok_homephone, nok_workphone, accident_date, accident_time, accident_type, accident_other_infos, other_information, physical_performance, vital_signs, skin, neck, heart, abdomen, pelvic_rectal, impression FROM patient WHERE firstname = ? and lastname = ?");
        pmt.setString(1, search1.getText());
        pmt.setString(2, search2.getText());
        ResultSet rst = pmt.executeQuery();
        
        if(rst.next()){
            String j1 = rst.getString(1);
            String j2 = rst.getString(2);
            String j3 = rst.getString(3);
            String j4 = rst.getString(4);
            String j5 = rst.getString(5);
            String j6 = rst.getString(6);
            String j7 = rst.getString(7);
            String j8 = rst.getString(8);
            String j9 = rst.getString(9);
            String j10 = rst.getString(10);
            String j11 = rst.getString(11);
            String j12 = rst.getString(12);
            String j13 = rst.getString(13);
            String j14 = rst.getString(14);
            String j15 = rst.getString(15);
            String j16 = rst.getString(16);
            String j17 = rst.getString(17);
            String j18 = rst.getString(18);
            String j19 = rst.getString(19);
            String j20 = rst.getString(20);
            String j21 = rst.getString(21);
            String j22 = rst.getString(22);
            String j23 = rst.getString(23);
            String j24 = rst.getString(24);
            String j25 = rst.getString(25);
            String j26 = rst.getString(26);
            String j27 = rst.getString(27);
            String j28 = rst.getString(28);
            String j29 = rst.getString(29);
            String j30 = rst.getString(30);
            String j31 = rst.getString(31);
            String j32 = rst.getString(32);
            String j33 = rst.getString(33);
            String j34 = rst.getString(34);
            
            g1.setText(j1);
            g2.setText(j2);
            g3.setText(j3);
            g4.setText(j4);
            g5.setText(j5);
            g6.setText(j6);
            g7.setText(j7);
            g8.setText(j8);
            g9.setText(j9);
            g10.setText(j9);
            g11.setText(j11);
            g12.setText(j12);
            g13.setText(j13);
            g14.setText(j14);
            g15.setText(j15);
            g16.setText(j16);
            g17.setText(j17);
            g18.setText(j18);
            g19.setText(j19);
            g20.setText(j20);
            g21.setText(j21);
            g22.setText(j22);
            g23.setText(j23);
            g24.setText(j24);
            g25.setText(j25);
            g26.setText(j26);
            g27.setText(j27);
            g28.setText(j28);
            g29.setText(j29);
            g30.setText(j30);
            g31.setText(j31);
            g32.setText(j32);
            g33.setText(j33);
            g34.setText(j34);
            
        }else{
            display2.setText("INVALID FIRSTNAME AND LASTNAME");
        }
        }
    
        public void docRevDB() throws SQLException, ClassNotFoundException{
            initializeDB();
            PreparedStatement pmt = connection.prepareStatement("INSERT INTO reviewDoctor(doctors_name, value_gotten) VALUES(?, ?)");
            
            pmt.setString(1, reviewCombo.getValue());
            pmt.setString(2, String.valueOf(total));
            
        }
        
        double amountCalc = 0;
        double details = 0;
        double other1 = 0;
        double other2 = 0;
        double other3 = 0;
        double other4 = 0;
        
        public void getAmountCalc(ActionEvent event){
            details = Double.parseDouble(c1.getText()) + Double.parseDouble(c2.getText()) + Double.parseDouble(c3.getText()) + Double.parseDouble(c4.getText()) + Double.parseDouble(c5.getText()) + Double.parseDouble(c6.getText()) + Double.parseDouble(c7.getText()) + Double.parseDouble(c8.getText()) + Double.parseDouble(c9.getText()) + Double.parseDouble(c10.getText()) + Double.parseDouble(c11.getText()) + Double.parseDouble(c12.getText()) + Double.parseDouble(c13.getText()) + Double.parseDouble(c14.getText()) + Double.parseDouble(c15.getText()) + Double.parseDouble(c16.getText()) + Double.parseDouble(c17.getText());
             other1 =  Double.parseDouble(c18.getText()) * Double.parseDouble(c19.getText());
             other2 =  Double.parseDouble(c20.getText()) * Double.parseDouble(c21.getText());
             other3 =  Double.parseDouble(c21.getText()) * Double.parseDouble(c22.getText());
             other4 =  Double.parseDouble(c23.getText()) * Double.parseDouble(c24.getText());
            
            amountCalc = details + other1 + other2 + other3 + other4;
            displayAmount.setText(String.valueOf(amountCalc));
            
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
    
    
}

 class BackButton{
     public void back(String instance, Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(instance));
        
        Parent root = loader.load();
       
        Scene scene1 = new Scene(root);
        scene1.getStylesheets().add(getClass().getResource("newstyle.css").toExternalForm());
        stage.setScene(scene1);
        stage.show();
 }
 }