package fr.port.entity;


public class Personne {

	private long id;
	protected String mail;
	protected String password;
	protected String nom;
	protected String prenom;
	
	public Personne() {
		
	}
	
	
	public Personne(String mail, String password, String nom, String prenom) {
		super();
		this.mail = mail;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
