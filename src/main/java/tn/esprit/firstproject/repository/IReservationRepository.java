package tn.esprit.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Reservation;

import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByEstValideIsTrue() ;
    @Query("select Reservation from Reservation r join Chambre c where c.bloc.idBloc=:idBloc")
    Reservation findForReservation(@Param("idBloc") long idBloc);
    @Query("select Reservation from Reservation r join Chambre c where c.bloc.foyer.universite.nomUniversite=:nomUniversite and r.anneeUniversitaire=:anneeUniversitaire")
    List<Reservation> findByAnneeUniversitaire_YearAndNomUnuiversite(@Param("anneeUniversitaire") int anneeUniversitaire, @Param("nomUniversite")  String nomUniversite);

}
