package fr.port.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="les_marchandises")
public class Marchandise {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_marchandise")
	private long id;
	
	@Autowired
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_envoi")
	private Envoi idEnvoi;
	
	
	private String nom;
	private float longueur;
	private float largeur;
	private float hauteur;
	private float poids;
	private boolean isFragile;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public Envoi getIdEnvoi() {
		return idEnvoi;
	}
	public void setIdEnvoi(Envoi idEnvoi) {
		this.idEnvoi = idEnvoi;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getLongueur() {
		return longueur;
	}
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	public float getLargeur() {
		return largeur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	public float getHauteur() {
		return hauteur;
	}
	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}
	public float getPoids() {
		return poids;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public boolean isFragile() {
		return isFragile;
	}
	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}
	@Override
	public String toString() {
		return "Marchandise [id=" + id + ", idEnvoi=" + idEnvoi + ", nom=" + nom + ", longueur=" + longueur
				+ ", largeur=" + largeur + ", hauteur=" + hauteur + ", poids=" + poids + ", isFragile=" + isFragile
				+ "]";
	}


	
	
	
	
	
	
	
	

}
