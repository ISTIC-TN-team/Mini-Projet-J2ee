package beans;
import java.sql.Date;

public class Commande {
	 private int idCommande ;
	 private String login ;
	 private Date dateCmd ;
	 private double prixTotale ;
	/**
	 * @return the idCommande
	 */
	public int getIdCommande() {
		return idCommande;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @return the dateCmd
	 */
	public Date getDateCmd() {
		return dateCmd;
	}
	/**
	 * @return the prixTotale
	 */
	public double getPrixTotale() {
		return prixTotale;
	}
	/**
	 * @param idCommande the idCommande to set
	 */
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @param dateCmd the dateCmd to set
	 */
	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	/**
	 * @param prixTotale the prixTotale to set
	 */
	public void setPrixTotale(double prixTotale) {
		this.prixTotale = prixTotale;
	}
	 


}
