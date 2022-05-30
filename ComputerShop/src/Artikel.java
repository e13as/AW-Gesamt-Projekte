public class Artikel {

    private String name;
    private String herstellerName;
    private String artikelNr;
    private int preis;

    public Artikel(String name, String herstellerName, String artikelNr, int preis) {
        this.name = name;
        this.herstellerName = herstellerName;
        this.artikelNr = artikelNr;
        this.preis = preis;
    }

    public String getName(){
     return name;
    }

    public String getHerstellerName(){
        return herstellerName;
    }

    public String getArtikelNr(){
        return artikelNr;
    }

    public int getPreis(){
        return preis;
    }
}
