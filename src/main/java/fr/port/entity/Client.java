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
@Table(name="les_clients")
public class Client extends Personne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private long id;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="idClient")
	private List<Envoi> idEnvoi;
	
	public Client() {
		
	}
	
	public Client(String nom,String prenom,String mail,String password) {
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.password=password;
		
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Envoi> getIdEnvoi() {
		return idEnvoi;
	}

	public void setIdEnvoi(List<Envoi> idEnvoi) {
		this.idEnvoi = idEnvoi;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", idEnvoi=" + idEnvoi + "]";
	}

	
	
	
	

}
