package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Reservation;

import java.util.List;

public interface IReservation {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long ReservationId);
    public Reservation addReservation(Reservation R);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
    Reservation findForReservation(long idBloc);
    List<Reservation> findByAnneeUniversitaire_YearAndNomUnuiversite(int anneeUniversitaire, String nomUniversite);
}
