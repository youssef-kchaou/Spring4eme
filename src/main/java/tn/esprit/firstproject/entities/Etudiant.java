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
public class Etudiant {
    @Id
    private long idEtudiant ;
    private String nomEt ;
    private String prenomEt ;
    private long cin ;
    private String ecole ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    @ManyToMany
    private List<Reservation> reservations ;

}
