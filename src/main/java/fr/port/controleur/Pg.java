package fr.port.controleur;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.port.business.GestionTransitaireImpl;

import fr.port.entity.Transitaire;


public class Pg {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("fr.port");
		appContext.refresh();
		
		GestionTransitaireImpl gestTran = (GestionTransitaireImpl)appContext.getBean("gestionTransitaire");
		
		gestTran.insererTransitaire(new Transitaire("larson","nicky","police","maillarson",560));
		gestTran.insererTransitaire(new Transitaire("jacky","chan","kung","mailchan",213));
		gestTran.listeTransitaire();
		
		appContext.close();
		
		

	}

}
