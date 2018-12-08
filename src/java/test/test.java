/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Article;
import beans.Client;
import beans.Commande;
import database.ArticleDao;
import database.ClientDao;
import database.CommandeDao;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author zone52
 */
public class test {
     public static void main(String[] args) throws SQLException 
    {
        ClientDao a = new ClientDao();
        Client s=a.getClient("Ali");
        System.out.println("login   #"+s.getLogin()+" mp    "+s.getMdp());
        System.out.println("#END client  #");
        CommandeDao b = new CommandeDao();
        Commande c=b.getCommande(1002);
        System.out.println("id   #"+c.getIdCommande()+" date    "+c.getDateCmd()+" prix    "+c.getPrixTotale()+" login    "
        +c.getLogin());
        System.out.println("#END client  #");
        ArticleDao  n=new ArticleDao();
        Vector<Article> v=n.getArticle();
                System.out.println("#BEGIN vector article  #");
 System.out.println(v.size());
   for (int k=0;k<v.size();k++)
          {
          Article current = (Article) v.elementAt(k);
          System.out.println(current.getLibelle());
       }
    }
    
}
