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

import org.springframework.stereotype.Component;


@Entity
@Table(name="les_bateaux")
public class Bateau {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_bateau")
	private long id;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_armateur")
	private Armateur idArmateur;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idBateau")
	private List<EspaceStockage> idEspaceStockage;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idBateau")
	private List<Voyage> idVoyage;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public Armateur getIdArmateur() {
		return idArmateur;
	}

	public void setIdArmateur(Armateur idArmateur) {
		this.idArmateur = idArmateur;
	}

	public List<EspaceStockage> getIdEspaceStockage() {
		return idEspaceStockage;
	}

	public void setIdEspaceStockage(List<EspaceStockage> idEspaceStockage) {
		this.idEspaceStockage = idEspaceStockage;
	}

	public List<Voyage> getIdVoyage() {
		return idVoyage;
	}

	public void setIdVoyage(List<Voyage> idVoyage) {
		this.idVoyage = idVoyage;
	}

	@Override
	public String toString() {
		return "Bateau [id=" + id + ", idArmateur=" + idArmateur + ", idEspaceStockage=" + idEspaceStockage
				+ ", idVoyage=" + idVoyage + "]";
	}

	

	

	
	
	

}
