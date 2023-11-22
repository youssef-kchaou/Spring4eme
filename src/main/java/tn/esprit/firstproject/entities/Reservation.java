package tn.esprit.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    private long idReservation ;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire ;
    private boolean estValide ;
    @ManyToMany (mappedBy ="reservations", cascade = CascadeType.ALL)
    private List<Etudiant> etudiants ;
}
