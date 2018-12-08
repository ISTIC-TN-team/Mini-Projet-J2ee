package database;
import beans.Article;
import java.io.IOException;
import java.sql.*;  
import java.util.Vector;
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
                c = new Article(rs.getInt("idarticle") ,rs.getString("libelle"),rs.getString("desc"),rs.getDouble("prix"),
                        rs.getString("img"),rs.getInt("qte"),rs.getDate("dateajout"));
       }

    }
    catch(SQLException e){
    }
    return c ;
}
 public Vector<Article> getArticle()
    {
        String req = "SELECT * FROM `article`";

        Vector<Article> vect = null;

        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next())
            {   

                if (vect == null)
                {   
                    vect = new Vector<>();
                }

                Article e = new Article(rs.getInt("idarticle") ,rs.getString("libelle"),rs.getString("desc"),rs.getDouble("prix"),
                        rs.getString("img"),rs.getInt("qte"),rs.getDate("dateajout"));

                vect.add(e);
            }
            return vect;
        } catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

}


