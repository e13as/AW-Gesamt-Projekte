public class Festplatten extends Artikel{

    // Groesse in GB
    private int groesse;
    private int drehzahl;

    public Festplatten(int groesse, int drehzahl, String name, String herstellerName, String artikelNr, int preis) {
        super(name, herstellerName,artikelNr,preis);
        this.groesse = groesse;
        this.drehzahl = drehzahl;
    }

    public int getGroesse(){
        return groesse;
    }

    public int getDrehzahl(){
        return drehzahl;
    }
}
