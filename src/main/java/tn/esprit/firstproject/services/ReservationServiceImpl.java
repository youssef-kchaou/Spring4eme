package tn.esprit.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Reservation;
import tn.esprit.firstproject.repository.IBlocRepository;
import tn.esprit.firstproject.repository.IReservationRepository;

import java.util.List;
@Service
public class ReservationServiceImpl implements IReservation {
    @Autowired
    IReservationRepository iReservationRepository ;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return iReservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(Long IdResevation) {
        return iReservationRepository.findById(IdResevation).get();
    }

    @Override
    public Reservation addReservation(Reservation R) {
        return iReservationRepository.save(R);
    }

    @Override
    public void removeReservation(Long reservationId) {
        iReservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return iReservationRepository.save(reservation);
    }

    @Override
    public Reservation findForReservation(long idBloc) {
        return iReservationRepository.findForReservation(idBloc);
    }

    @Override
    public List<Reservation> findByAnneeUniversitaire_YearAndNomUnuiversite(int anneeUniversitaire, String nomUniversite) {
        return iReservationRepository.findByAnneeUniversitaire_YearAndNomUnuiversite(anneeUniversitaire,nomUniversite);
    }
}
