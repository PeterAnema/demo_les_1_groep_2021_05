package nl.peteranema.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Speler {

    // attributen
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public int rugnummer;
    public String naam;
    public String positie;

    public String foto_locatie;

    public long team_id;

}
