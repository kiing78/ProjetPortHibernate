package fr.port.business;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.port.entity.Transitaire;
import fr.port.repository.ITransitaire;

@Service("gestionTransitaire")
//@Transactional
public class GestionTransitaireImpl implements IGestionTransitaire {
	
	@Autowired
	private ITransitaire transiDao;

	@Override
	public void insererTransitaire(Transitaire o) {
		transiDao.save(o);
		System.out.println("ajouté");
		
	}

	@Override
	public void supprimerUnTransitaire(long id) {
		transiDao.deleteById(id);
		System.out.println("supprimé");
		
	}

	@Override
	public void supprimerTous() {
		transiDao.deleteAll();
		System.out.println("tous supprimÃ©");
		
	}

	@Override
	public void trouverUnTransitaire(long id) {
		System.out.println(transiDao.findById(id));
		System.out.println("reussi");

		
	}

	@Override
	public void listeTransitaire() {
		Iterable<Transitaire> listeTransitaire = transiDao.findAll();
		listeTransitaire.forEach(System.out::println);
		
	}
	

}
