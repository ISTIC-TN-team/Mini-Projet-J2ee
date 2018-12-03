package database;
import beans.Commande;
import java.sql.*;
/**
 **Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** Date :2018 - 2019
 **/
public class CommandeDao {
    Connection con = DBConnexion.getInstance();
     public boolean addCommande(Commande a)
    {
        try
        {
            String req = "INSERT INTO `w-shopdb`.`commande` (`login`, `prixtotale`) "
                    + "VALUES ('"+a.getLogin()+"', '"+a.getPrixTotale()+"');";

            Statement st = con.createStatement();

            int rs = st.executeUpdate(req);

            if (rs > 0)
            {
                return true;
            }

        } catch (Exception e1)
        {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        return false;
    }
	public Commande getCommande(int id){
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
