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
@Table(name="les_ports")
public class Port {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_port")
	private long id;
	
	@Column(name="nom_port")
	private String nom;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="idPortDepart")
	private List<Voyage> idVoyage;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idPortArrivee")
	private List<Voyage> idVoyageArrivee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Voyage> getIdVoyage() {
		return idVoyage;
	}

	public void setIdVoyage(List<Voyage> idVoyage) {
		this.idVoyage = idVoyage;
	}

	public List<Voyage> getIdVoyageArrivee() {
		return idVoyageArrivee;
	}

	public void setIdVoyageArrivee(List<Voyage> idVoyageArrivee) {
		this.idVoyageArrivee = idVoyageArrivee;
	}

	@Override
	public String toString() {
		return "Port [id=" + id + ", nom=" + nom + ", idVoyage=" + idVoyage + ", idVoyageArrivee=" + idVoyageArrivee
				+ "]";
	}
	
	
	
	

}
