package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.repository.IEtudiantRepository;

import java.util.List;
@Service
public class EtudiantServiceImpl implements IEtudiant{
    @Autowired
    IEtudiantRepository iEtudiantRepository ;
    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return iEtudiantRepository.findAll() ;
    }

    @Override
    public Etudiant retrieveEtudiant(Long etudiantId) {
        return iEtudiantRepository.findById(etudiantId).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return iEtudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(Long etudiantId) {
        iEtudiantRepository.deleteById(etudiantId);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return iEtudiantRepository.save(etudiant);
    }
}
