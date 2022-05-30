package de.awacademy.interfaces.schnittstellen_vorlage;

public class Tastatur implements Produkt{

    public int id;
    public String produktName;

    public boolean mitNummerBlock;
    public String farbe;
    public boolean drahtLos;

    public String beschreibe() {
        String ausgabe = "  Nummernblock: " + mitNummerBlock + "\n";
        ausgabe += "  Farbe:        " + farbe + "\n";
        ausgabe += "  Drahtlos:     " + drahtLos + "\n";
        return ausgabe;
    }
}
