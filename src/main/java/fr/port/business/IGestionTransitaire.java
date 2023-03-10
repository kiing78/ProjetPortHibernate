package fr.port.business;

import fr.port.entity.Transitaire;

public interface IGestionTransitaire {
	public void insererTransitaire(Transitaire o);
	public void supprimerUnTransitaire(long id);
	public void supprimerTous();
	public void trouverUnTransitaire(long id);
	public void listeTransitaire();
	
	/*
	public void envoieFormulaireDemande();
	public void choixTransitaire();
	public void envoyerFormulaireTransitaire();
	public void afficherTransitaireSuccess();
	*/

}
