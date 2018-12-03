package database;
import beans.Article;
import java.sql.*;  
/**
 **Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** Date :2018 - 2019
 **/
public class ArticleDao {
    
 public Article getArticle(int idarticle){
    Connection con=DBConnexion.getInstance();
    Article c=new Article();
    PreparedStatement statement;
    String sql="SELECT * FROM `article` WHERE `idarticle` = ? ";
    try{
        
    statement=con.prepareStatement(sql);
    statement.setInt(1,idarticle); 
    ResultSet rs=statement.executeQuery();
    while (rs.next()) {
                c = new Article(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getInt(5));
       }

    }
    catch(SQLException e){
    }
    return c ;
}
}


