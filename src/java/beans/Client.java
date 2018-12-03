package beans;
import java.sql.Date;
/**
 **Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** Date :2018 - 2019
 **/
public class Client {
	private String login;
	private String mdp;
	private String nom;
	private String prenom;
	private Date dtNaissance;

    /**
     * Constructeur 
     */
    public Client()
    {
        
    }
    public Client(String login, String mdp, String nom, String prenom, Date dtNaissance)
    {
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.dtNaissance = dtNaissance;
    }

	/**
	 * @return the dtNaissance
	 */
	public Date getDtNaissance() {
		return dtNaissance;
	}
	/**
	 * @param dtNaissance the dtNaissance to set
	 */
	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}
