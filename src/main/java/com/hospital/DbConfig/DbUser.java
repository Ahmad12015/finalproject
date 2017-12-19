package LMS.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUser {

    private Statement aStatement;
    public boolean verifyUser(String loginName, String Password){
        boolean isFound = false;
        try {
            DbConnection aDbConnection =
                    DbConnection.getDbConnection();
            aStatement= aDbConnection.getStatement();
            ResultSet rs = aStatement.
             executeQuery("Select * from users where userName='"
                     + loginName + "' and password='"
             + Password + "'");
            if(rs.next())
                isFound = true;           
           
        } catch (Exception ex) {
            Logger.getLogger(DbUser.class.getName()).log(Level.SEVERE, null, ex);
        }
         return isFound;
    }   
}