public class Tastaturen extends EingabeGeraete {

    /**
     * nummernblock = true
     * kein nummernblock = false
     */
    private boolean nummernblock;


    public Tastaturen(boolean nummernblock, String name, String herstellerName, String artikelNr, int preis, boolean kabel) {
        super(name, herstellerName, artikelNr, preis, kabel);
        this.nummernblock = nummernblock;

    }

    public boolean isNummernblock() {
        return nummernblock;
    }

}
