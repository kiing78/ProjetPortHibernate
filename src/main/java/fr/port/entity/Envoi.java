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
@Table(name="les_envoi")
public class Envoi {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_envoi")
	private long id;
	

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_voyage")
	private Voyage idVoyage;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_transitaire")
	private Transitaire idTransitaire;
	
	@Autowired
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_client")
	private Client idClient;
	
	@Autowired
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_espace_stockage")
	private EspaceStockage idEspaceStockage;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idEnvoi")
	private List<Marchandise> idMarchandise;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Voyage getIdVoyage() {
		return idVoyage;
	}

	public void setIdVoyage(Voyage idVoyage) {
		this.idVoyage = idVoyage;
	}

	

	

	public Transitaire getIdTransitaire() {
		return idTransitaire;
	}

	public void setIdTransitaire(Transitaire idTransitaire) {
		this.idTransitaire = idTransitaire;
	}

	public Client getIdClient() {
		return idClient;
	}

	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}

	

	public EspaceStockage getIdEspaceStockage() {
		return idEspaceStockage;
	}

	public void setIdEspaceStockage(EspaceStockage idEspaceStockage) {
		this.idEspaceStockage = idEspaceStockage;
	}
	

	public List<Marchandise> getIdMarchandise() {
		return idMarchandise;
	}

	public void setIdMarchandise(List<Marchandise> idMarchandise) {
		this.idMarchandise = idMarchandise;
	}

	@Override
	public String toString() {
		return "Envoi [id=" + id + ", idVoyage=" + idVoyage + ", idTransitaire=" + idTransitaire + ", idClient="
				+ idClient + ", idEspaceStockage=" + idEspaceStockage + ", idMarchandise=" + idMarchandise + "]";
	}

	


	
	
	

	
	
	



	
	
	
	

}
