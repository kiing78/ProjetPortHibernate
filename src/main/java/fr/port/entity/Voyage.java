
package fr.port.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="les_voyages")
public class Voyage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_voyage")
	private long id;

	@Basic
	@Column(name="date_depart")
	private java.sql.Date dateDepart;

	@Basic
	@Column(name="date_arrivee")
	private java.sql.Date dateArrivee;
	
	@Autowired
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_bateau")
	private Bateau idBateau;
	
	@Autowired
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_port_depart")
	private Port idPortDepart;
	
	@Autowired
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_port_arrivee")
	private Port idPortArrivee;
	
	@Autowired
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="idVoyage")//map a la nouvelle entité
	private List<Transitaire> idTransitaire;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idVoyage")
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

	public Port getIdPortDepart() {
		return idPortDepart;
	}

	public void setIdPortDepart(Port idPortDepart) {
		this.idPortDepart = idPortDepart;
	}

	public Port getIdPortArrivee() {
		return idPortArrivee;
	}

	public void setIdPortArrivee(Port idPortArrivee) {
		this.idPortArrivee = idPortArrivee;
	}

	public List<Transitaire> getIdTransitaire() {
		return idTransitaire;
	}

	public void setIdTransitaire(List<Transitaire> idTransitaire) {
		this.idTransitaire = idTransitaire;
	}

	public List<Envoi> getIdEnvoi() {
		return idEnvoi;
	}

	public void setIdEnvoi(List<Envoi> idEnvoi) {
		this.idEnvoi = idEnvoi;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	@Override
	public String toString() {
		return "Voyage{" +
				"id=" + id +
				", dateDepart=" + dateDepart +
				", dateArrivee=" + dateArrivee +
				", idBateau=" + idBateau +
				", idPortDepart=" + idPortDepart +
				", idPortArrivee=" + idPortArrivee +
				", idTransitaire=" + idTransitaire +
				", idEnvoi=" + idEnvoi +
				'}';
	}
}
