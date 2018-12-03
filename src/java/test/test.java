/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Client;
import beans.Commande;
import database.ClientDao;
import database.CommandeDao;

/**
 *
 * @author zone52
 */
public class test {
     public static void main(String[] args) 
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
    }
    
}
