package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
  public  Connection connection;
    public  Connection getConnetion() throws ClassNotFoundException, SQLException {

        String dbName ="bank_management";
         String userName = "root";
         String password ="";

         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);

        return connection;
    }
}
