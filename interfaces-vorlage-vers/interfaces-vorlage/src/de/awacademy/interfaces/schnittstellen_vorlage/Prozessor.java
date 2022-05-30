package de.awacademy.interfaces.schnittstellen_vorlage;

public class Prozessor implements Produkt{

    public int id;
    public String produktName;

    public int geschwindigkeit;
    public int anzahlKerne;

    public String beschreibe() {
        String ausgabe = "  Taktung: " + geschwindigkeit + "\n";
        ausgabe += "  Kerne:   " + anzahlKerne + "\n";
        return ausgabe;
    }
}
