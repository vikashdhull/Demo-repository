package mypack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operation {

	private int id;

	public void save(Object o) {
		
		if(o instanceof Emp) {
			Emp e = (Emp)o;
			
			Connection c =ConnectionProvider.getconn();
			// System.out.println(c);
			
			try {
				PreparedStatement	ps = c.prepareStatement("insert into student values(?,?,?)");
			     ps.setInt(1,e.getId());
			     ps.setString(2,e.getName());
			     ps.setString(3,e.getCmpname());
			     
			     int i = ps.executeUpdate();
			     if(i>0)
			    	 System.out.println("data inserted ....");
			     else
			    	 System.out.println("not data inserted ....");
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}			
		}	
		
		
		
		
		
			}
	
	

