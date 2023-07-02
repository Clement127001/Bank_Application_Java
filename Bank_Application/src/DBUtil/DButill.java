//connecting to a database with the application

package DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;
public class DButill 
{
	public static Connection getDBConnection() 
    {
        Connection  con= null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

//database need to changed
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","TIGER");
          System.out.println("Database connected successfully");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Exception occured while connecting database");
            e.printStackTrace(); 
        }
      return con;
    }
}

