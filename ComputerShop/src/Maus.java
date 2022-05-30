public class Maus extends EingabeGeraete {

    private int anzahlTasten;

    public Maus(int anzahlTasten, String name, String herstellerName, String artikelNr, int preis, boolean kabel) {
        super(name, herstellerName, artikelNr, preis, kabel);
        this.anzahlTasten = anzahlTasten;

    }

    public int getAnzahlTasten() {
        return anzahlTasten;
    }


}
