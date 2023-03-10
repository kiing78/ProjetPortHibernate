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
import org.springframework.stereotype.Component;


@Entity
@Table(name="espace_stockage")
public class EspaceStockage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_espace_stockage")
	private long id;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_bateau")
	private Bateau idBateau;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idEspaceStockage")
	private List<Envoi> idEnvoi;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



	public Bateau getIdBateau() {
		return idBateau;
	}


	public void setIdBateau(Bateau idBateau) {
		this.idBateau = idBateau;
	}
	
	


	public List<Envoi> getIdEnvoi() {
		return idEnvoi;
	}


	public void setIdEnvoi(List<Envoi> idEnvoi) {
		this.idEnvoi = idEnvoi;
	}


	@Override
	public String toString() {
		return "EspaceStockage [id=" + id + ", idBateau=" + idBateau + ", idEnvoi=" + idEnvoi + "]";
	}


	

	

	
	
	



	
	

}
