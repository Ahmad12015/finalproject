package LMS.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    private static DbConnection aDbConnection;
    private Connection aConnection;
    private Statement aStatement;
    private DbConnection(){}
    public static DbConnection getDbConnection(){
        if(aDbConnection == null)
            aDbConnection = new DbConnection();
        return aDbConnection;
    }
    public Statement getStatement()
            throws Exception, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        aConnection = 
                DriverManager.
    getConnection("jdbc:mysql://localhost:3306","root","root");
        aStatement = aConnection.createStatement();
        return aStatement;
        
    }   
}