package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Etudiant;

import java.util.List;

public interface IEtudiant {
    public List<Etudiant> retrieveAllEtudiant();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant e);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
