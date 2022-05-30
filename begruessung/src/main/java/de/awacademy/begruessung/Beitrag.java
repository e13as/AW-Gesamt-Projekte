package de.awacademy.begruessung;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Beitrag {

    // Felder
    @Id
    @GeneratedValue
    private int id;

    private String nachricht;

    public List<Kommentar> getKommentare() {
        return kommentare;
    }

//    public void setKommentare(List<Kommentar> kommentare) {
//        this.kommentare = kommentare;
//    }

    private String titel;

    @OneToMany(mappedBy = "beitrag")
    private List<Kommentar> kommentare;

    // Konstruktor
    public Beitrag(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
