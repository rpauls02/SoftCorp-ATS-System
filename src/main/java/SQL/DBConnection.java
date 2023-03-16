package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    private Connection con;

    public Connection getConnection() {
        try {
            /*Class.forName("com.mysql.jdbc.Driver");*/
            Properties connectionProps = new Properties();
            connectionProps.put("user", "in2018g12_d");
            connectionProps.put("password", "RS8A4UlP");
            con = DriverManager.getConnection("jdbc:mysql://"
                    + "smcse-stuproj00.city.ac.uk" + ":" + "3306"
                    + "/" + "in2018g12", connectionProps);
        }
        catch(SQLException sqle){
            System.out.println("Could not establish connection. Check logs.");
        }
        finally{ return con; }
    }
}
