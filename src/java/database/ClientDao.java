package database;
import beans.Client;
import java.sql.*;
/**
 **@Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** @Date :2018 - 2019
 **/
public class ClientDao {
	
Connection con=DBConnexion.getInstance();

@SuppressWarnings("finally")
public boolean addClient(Client a) {
	 int resultat=-1;
          PreparedStatement statement;
	String req="INSERT INTO `client` (`login`, `mdp`, `nom`, `prenom`) VALUES ('"
                +a.getLogin()+"','"+a.getMdp()+"','"+a.getPrenom()+"','"+a.getNom()+"');";
try {
	 statement=con.prepareStatement(req);
      
   resultat = statement.executeUpdate(req);
}catch(Exception e)
{
             Throwable cause = e.getCause();
             System.out.println(e.fillInStackTrace());
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

public Client getClient(String login){
   
    PreparedStatement statement;
    String sql="SELECT * FROM `client` WHERE `login` = ?";
    try{
        
    statement=con.prepareStatement(sql);
    statement.setString(1,login); 
    ResultSet rs=statement.executeQuery();
    Client c = null;

            if (rs.next())
            {
                c = new Client(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5));

            }
            return c;

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
