public class EingabeGeraete extends Artikel {

    /**
     * kabel = true;
     * drahtlos = false;
     */
    private boolean kabel;

    public EingabeGeraete(String name, String herstellerName, String artikelNr, int preis, boolean kabel) {
        super(name, herstellerName, artikelNr, preis);
        this.kabel = kabel;
    }

    public boolean isKabel() {
        return kabel;
    }

}
