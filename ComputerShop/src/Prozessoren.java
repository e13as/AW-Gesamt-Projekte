public class Prozessoren extends Artikel{
    private int frequenz;

    public Prozessoren(int frequenz, String name, String herstellerName, String artikelNr, int preis) {
        super(name,herstellerName,artikelNr,preis);
        this.frequenz = frequenz;

    }

    public int getFrequenz() {
        return frequenz;
    }
}
