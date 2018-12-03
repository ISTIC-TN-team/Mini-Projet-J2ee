package database;
import beans.Article;
import java.sql.*;  

public class ArticleDao {
    
 public Article getClient(String libelle){
    Connection con=DBConnexion.getInstance();
    Article c=new Article();
    PreparedStatement statement;
    String sql="";
    try{
        
    statement=con.prepareStatement(sql);
    statement.setString(1,libelle); 
    ResultSet rs=statement.executeQuery();
    while (rs.next()) {
	
       }

    }
    catch(SQLException e){
    }
    return c ;
}
}


