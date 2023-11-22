package tn.esprit.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc {
    @Id
    private long idBloc ;
    private String nomBloc ;
    private long capaciteBloc ;
    @ManyToOne
    private Foyer foyer;
    @OneToMany (mappedBy = "bloc",cascade = CascadeType.ALL)
    private List<Chambre> chambers;

}
