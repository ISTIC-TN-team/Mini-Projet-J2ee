package database;
import beans.Commande;
import java.sql.*;

public class CommandeDao {
    
	public Commande getCommande(int id){
    Connection con=DBConnexion.getInstance();
    Commande c=new Commande();
    PreparedStatement statement;
    String sql="SELECT *  FROM `commande` WHERE `idcommande` =?";
    try{
        
    statement=con.prepareStatement(sql);
    statement.setInt(1,id); 
    ResultSet rs=statement.executeQuery();
    while (rs.next()) {
        int idc=rs.getInt("idcommande");
        double prix=rs.getFloat("prixtotale");
        Date date=rs.getDate("datecmd");
        String login= rs.getString("login");
            
         
        c.setIdCommande(idc);
        c.setLogin(login);
        c.setDateCmd(date);
        c.setPrixTotale(prix);
        
       }

    }
    catch(SQLException e){
    }
    return c ;
}

}
