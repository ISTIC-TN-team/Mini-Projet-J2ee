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
	String req="INSERT INTO `client`(`login`, `mdp`, `nom`, `prenom`, `dtnaissance`) VALUES ("+a.getLogin()+","+a.getMdp()+","+a.getNom()+","+a.getPrenom()+","+a.getDtNaissance()+")";
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
