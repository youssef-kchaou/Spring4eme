package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.entities.Universite;
import tn.esprit.firstproject.repository.IFoyerRepository;
import tn.esprit.firstproject.repository.IUniversityRepository;

import java.util.List;

@Service
public class UniversiteServiceImpl implements IUniversity{
    @Autowired
    IUniversityRepository UniversiteRpo ;
    @Autowired
    IFoyerRepository FoyerRepo ;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return UniversiteRpo.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long UniversiteId) {
        return UniversiteRpo.findById(UniversiteId).get();
    }

    @Override
    public Universite addUniversite(Universite U) {
        return UniversiteRpo.save(U);
    }

    @Override
    public void removeUniversite(Long universiteId) {
        UniversiteRpo.deleteById(universiteId);
    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return UniversiteRpo.save(universite);
    }

    @Override
    public Universite affectFoyerUniversite(long idFoyer, long idUniversite) {
        Foyer foyer =FoyerRepo.findById(idFoyer).get() ;
        Universite universite = UniversiteRpo.findById(idUniversite).get();
        universite.setFoyer(foyer);
        return (universite);
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        Universite universite = UniversiteRpo.findById(idUniversite).get();
        universite.setFoyer(foyer);
        return foyer ;
    }

//    @Override
//    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {
//        Universite universite = UniversiteRpo.findUniversiteByNomUniversite(nomUniversite) ;
//        List<Chambre> chambres ;
//        List<Bloc> b = universite.getFoyer().getBlocs() ;
//        for(int i =0 ; i< b.size();i++){
//            for (int j = 0 ; j<b.get(i).getChambers();j++ ){
//
//            }
//        }
//    }


}
