public class SSDSpeicher extends Artikel {

    // Groesse in GB
    private int groesse;




    public SSDSpeicher(int groesse, String name, String herstellerName, String artikelNr, int preis) {
        super(name,herstellerName,artikelNr,preis);
        this.groesse = groesse;
    }

    public int getGroesse() {
        return groesse;
    }
}
