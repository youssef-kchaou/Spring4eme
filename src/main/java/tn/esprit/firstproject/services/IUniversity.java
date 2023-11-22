package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.entities.Reservation;
import tn.esprit.firstproject.entities.Universite;

import java.util.List;

public interface IUniversity {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long UniversiteId);
    public Universite addUniversite(Universite U);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
    public Universite affectFoyerUniversite(long idFoyer , long idUniversite);
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;
//    public List<Chambre>  getChambresParNomUniversite( String nomUniversite) ;
}
