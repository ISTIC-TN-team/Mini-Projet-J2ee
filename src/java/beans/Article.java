package beans;  
import java.sql.Date;  
/**
 **Author Skanderbelgaied / Heni abdmouleh  / Marwen Bougossa 
 ** Date :2018 - 2019
 **/
public class Article {
    private int idArticle ;
    private String libelle ;
    private String desc ;
    private double prix ; 
    private String img ;
    private int qte ;
    private Date dateAjout ;
	/**
	 * @return the idArticle
	 */
    public Article()
    {
    }


    
    
    public Article(String libelle, String desc, double prix, String img, int qte)
    {
        this.libelle = libelle;
        this.desc = desc;
        this.prix = prix;
        this.img = img;
        this.qte = qte;
    }

	public int getIdArticle() {
		return idArticle;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @return the qte
	 */
	public int getQte() {
		return qte;
	}
	/**
	 * @return the dateAjout
	 */
	public Date getDateAjout() {
		return dateAjout;
	}
	/**
	 * @param idArticle the idArticle to set
	 */
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * @param qte the qte to set
	 */
	public void setQte(int qte) {
		this.qte = qte;
	}
	/**
	 * @param dateAjout the dateAjout to set
	 */
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}


}
