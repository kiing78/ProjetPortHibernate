package fr.port.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="les_armateurs")
public class Armateur extends Personne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_armateur")
	private long id;//variable =code
	
	@Column(name="nom_entreprise_armateur")
	private String nomEntreprise;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idArmateur")
	private List<Bateau> idBateau;
	
	private int siret;
	
	public Armateur() {
		
	}
	
	public Armateur(String nom,String prenom,String mail,String password,String nomEntreprise, int siret){
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.password=password;
		this.nomEntreprise = nomEntreprise;
		this.siret = siret;
	}

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
	

	public List<Bateau> getIdBateau() {
		return idBateau;
	}

	public void setIdBateau(List<Bateau> idBateau) {
		this.idBateau = idBateau;
	}

	@Override
	public String toString() {
		return "Armateur [id=" + id + ", nomEntreprise=" + nomEntreprise + ", idBateau=" + idBateau + ", siret=" + siret
				+ "]";
	}

	
	
	
	
	
	
	

}
