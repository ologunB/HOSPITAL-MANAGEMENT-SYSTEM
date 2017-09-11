
package newproject;
import java.sql.*;

public class hosDB {
    
   Connection connection;
   
public void initializeDB() throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Connected");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/user_details", "root", "tope");
        System.out.println("Database Connected");
}

public void appointmentDb() throws SQLException, ClassNotFoundException{
    initializeDB();
    
}



}