package nl.peteranema.demo.model;

import java.util.ArrayList;
import java.util.List;


public class Team {

    // attributen
    long id;
    String land;

    List<Speler> spelers = new ArrayList<>();

    // methoden
    void addSpeler(Speler speler) {
        this.spelers.add(speler);
    }

}
