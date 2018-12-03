package database;
import beans.Article;
import java.sql.*;  
/**
 **Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** Date :2018 - 2019
 **/
public class ArticleDao {
        Connection con=DBConnexion.getInstance();

     public boolean addArticle(Article a)
    {
        try
        {
            String req = "INSERT INTO article(`idarticle`, `libelle`, `desc`, `prix`, `img`, `qte`)"
                    + " VALUES (NULL , '" + a.getLibelle() + "', '" + a.getDesc() + "', '" + a.getPrix() + "', '" + a.getImg() + "', '" + a.getQte() + "');";

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
 public Article getArticle(int idarticle){
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


