package database;

import java.sql.*;


public class DBConnexion {
	
	  private static Connection con=null;
	  
	    private  DBConnexion()
	    {
	        try
	        {
	            Class.forName("com.mysql.jdbc.Driver");
	            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/w-shop","root","");
	        }
	        catch(ClassNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	        catch(SQLException e1)
	        {
	            e1.printStackTrace();
	        }
	    }
	    public static Connection getInstance()
	    {
	        if(con==null)
	            new DBConnexion();
	        return con;
	            
	        
	    }

}
