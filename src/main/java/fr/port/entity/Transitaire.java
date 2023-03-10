package fr.port.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="les_transitaires")
public class Transitaire extends Personne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transitaire")
	private long id;
	private String nom;
	private String prenom;
	@Column(name="nom_entreprise")
	private String nomEntreprise;
	private String mail;
	private int siret;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idTransitaire")
	private List<Envoi> idEnvoi;
	
	
	@ManyToMany(cascade=CascadeType.ALL)//créer une nouvelle entité car c'est n,n
	@JoinTable(
	        name = "transitaire_voyage", 
	        joinColumns = { @JoinColumn(name = "id_transitaire") }, 
	        inverseJoinColumns = { @JoinColumn(name = "id_voyage") }
	    )
	private List<Voyage> idVoyage;
	
	public Transitaire() {
		
	}
	
	public Transitaire (String nom,String prenom,String nomEntreprise,String mail,int siret) {
		this.nom=nom;
		this.prenom=prenom;
		this.nomEntreprise=nomEntreprise;
		this.mail=mail;
		this.siret=siret;
		
	}
	
	
	/*
	public Transitaire(long id,String nom,String prenom,String mail,String password,String nomEntreprise, int siret) {
	super();
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.password=password;
		this.nomEntreprise = nomEntreprise;
		this.siret = siret;
		
	}
	*/


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}


	public List<Voyage> getIdVoyage() {
		return idVoyage;
	}

	public void setIdVoyage(List<Voyage> idVoyage) {
		this.idVoyage = idVoyage;
	}
	
	
	
	public List<Envoi> getIdEnvoi() {
		return idEnvoi;
	}

	public void setIdEnvoi(List<Envoi> idEnvoi) {
		this.idEnvoi = idEnvoi;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}



	@Override
	public String toString() {
		return "Transitaire [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nomEntreprise=" + nomEntreprise
				+ ", mail=" + mail + ", siret=" + siret + ", idEnvoi=" + idEnvoi + ", idVoyage=" + idVoyage + "]";
	}

	public String afficheTransitaire() {
		return "nom"+nom+" prenom= "+prenom+" nomEntreprise ="+nomEntreprise+" mail= "+mail;
	}
	
	
	
	
	
	
	
	

}
