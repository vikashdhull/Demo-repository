package mypack;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection connection = null;
	   private ConnectionProvider()
	   {
		   
	   }
		
	   public static Connection getconn()
	   {
		
		   if(connection==null) {
			   
			   try {
				   Class.forName("com.mysql.jdbc.Driver");
				   connection  = DriverManager.getConnection("jdbc:mysql://localhost:3307/sys","root","root");
				   return connection;
				   
			   }
			   
			   catch(Exception e) {
				   e.printStackTrace();
			   }
		   }
		   else {
			   return connection;
		   }
		return connection;
	   }

}
