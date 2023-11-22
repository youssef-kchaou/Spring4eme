package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Bloc;

@Repository
public interface IBlocRepository extends JpaRepository<Bloc, Long> {
}
