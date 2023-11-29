package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Bloc;

import java.util.List;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc, Long> {
    List<Bloc> findByFoyerUniversiteIdUniversite(long idUniversite);

}
