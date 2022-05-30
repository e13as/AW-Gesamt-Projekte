package de.awacademy.interfaces.schnittstellen_vorlage;

public class Monitor {

    public int id;
    public String produktName;

    public int groesse;
    public float gewicht;

    public String beschreibe() {
        String ausgabe = "  Größe:   " + groesse + "\n";
        ausgabe += "  Gewicht: " + gewicht + "\n";
        return ausgabe;
    }

}
