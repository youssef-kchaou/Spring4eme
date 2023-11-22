package tn.esprit.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.services.IFoyer;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {
    @Autowired
    IFoyer FoyerService ;

    @PostMapping("/addfoyer")
    public Foyer addFoyer(@RequestBody Foyer F){
        return FoyerService.addFoyer(F) ;
    }
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = FoyerService.retrieveAllFoyers();
        return listFoyers;
    }
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long FId) {
        Foyer foyer = FoyerService.retrieveFoyer(FId);
        return foyer;
    }
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long FId) {
        FoyerService.removeFoyer(FId);
    }
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer F) {
        Foyer foyer = FoyerService.modifyFoyer(F);
        return foyer;
    }
}
