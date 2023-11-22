package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.entities.Universite;
import tn.esprit.firstproject.services.IUniversity;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversityController {
    @Autowired
    IUniversity UniversityService ;

    @PostMapping("/adduniversite")
    public Universite addUniversite(@RequestBody Universite U){
        return UniversityService.addUniversite(U) ;
    }

    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = UniversityService.retrieveAllUniversites();
        return listUniversites;
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveReservation(@PathVariable("universite-id") Long UId) {
        Universite universite = UniversityService.retrieveUniversite(UId);
        return universite;
    }
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long UId) {
        UniversityService.removeUniversite(UId);
    }
    @PutMapping("/modify-universite")
    public Universite modifyReservation(@RequestBody Universite U) {
        Universite universite = UniversityService.modifyUniversite(U);
        return universite;
    }

    @PostMapping("/affect-foyer-universite/{Foyer-id}/{universite-id}")
    public Universite affectFoyerUniversite(@PathVariable("Foyer-id") Long Fid,
                                            @PathVariable("universite-id") Long Uid) {
        Universite universite = UniversityService.affectFoyerUniversite(Fid, Uid);
        return universite;
    }
    @PostMapping("/ajouter-foyer-affect-universite/{universite-id}")
    public Foyer ajouterFoyerAffectUniversite(@RequestBody Foyer foyer,
                                                   @PathVariable("universite-id") Long Uid) {
        return UniversityService.ajouterFoyerEtAffecterAUniversite(foyer,Uid) ;
    }
}
