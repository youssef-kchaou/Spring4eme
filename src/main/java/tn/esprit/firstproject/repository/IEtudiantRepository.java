package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Etudiant;

import java.util.List;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {



}
