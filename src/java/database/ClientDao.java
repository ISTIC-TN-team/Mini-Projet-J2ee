package database;
import beans.Client;
import java.sql.*;

public class ClientDao {
	
Connection con=DBConnexion.getInstance();

@SuppressWarnings("finally")
public boolean addClient(Client a) {
	 int resultat=-1;
	String req="";
try {
	Statement st = con.createStatement();

   resultat = st.executeUpdate(req);
}catch(Exception e)
{
	
}
finally{
	if (resultat>0)
	{ 
	return true;
	}
	else
	{ return false;}
}
}

public Client getClient(String nom){
    Connection con=DBConnexion.getInstance();
    Client c=new Client();
    PreparedStatement statement;
    String sql="SELECT * FROM `client` WHERE `login` = ?";
    try{
        
    statement=con.prepareStatement(sql);
    statement.setString(1,"skander"); 
    ResultSet rs=statement.executeQuery();
    while (rs.next()) {
	String user= rs.getString("login");
	String usermp = rs.getString("mdp");
        c.setLogin(user);
        c.setMdp(usermp);
       }

    }
    catch(SQLException e){
    }
    return c ;
}
}
