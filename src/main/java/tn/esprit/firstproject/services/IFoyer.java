package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.entities.Reservation;

import java.util.List;

public interface IFoyer {
    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long FoyerId);
    public Foyer addFoyer(Foyer F);
    public void removeFoyer(Long FoyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
