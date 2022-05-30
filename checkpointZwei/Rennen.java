package Test;

import java.util.ArrayList;

public class Rennen {

    private double distanz;

    public ArrayList<Fahrzeug> teilnehmerListe;
    private double bestZeit;
    private Fahrzeug gewinner;

    private boolean durchgefuehrt;

    public Rennen(double distanz) {
        this.distanz = distanz;
        this.teilnehmerListe = new ArrayList<>();
        this.bestZeit = Float.MAX_VALUE;
        this.durchgefuehrt = false;
    }

    public void teilnehmerRegistrieren(Fahrzeug teilnehmer) {
        if (this.durchgefuehrt){
            throw new IllegalStateException("Test.Rennen bereits durchgeführt.");
        }
        this.teilnehmerListe.add(teilnehmer);
    }

    public void durchfuehren(){
        for (Fahrzeug teilnehmer : this.teilnehmerListe) {
            double zeit = teilnehmer.fahre(this.distanz);
            System.out.println(teilnehmer.getName()+" time: "+zeit);
            if (zeit < this.bestZeit) {
                this.bestZeit = zeit;
                this.gewinner = teilnehmer;
            }
        }
        this.durchgefuehrt = true;
        System.out.println(this.bestZeit);
        System.out.println(this.gewinner);
    }

    public Fahrzeug getGewinner() {
        if (!this.durchgefuehrt){
            throw new IllegalStateException("Gewinner steht noch nicht fest.");
        }
        return this.gewinner;
    }

    public double getBestZeit() {
        if (!this.durchgefuehrt){
            throw new IllegalStateException("Bestzeit noch nicht fest");
        }
        return this.bestZeit;
    }
}
