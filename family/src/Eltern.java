public class Eltern extends Person{
    private String beruf;
    private double einkommen;

    public Eltern(String vorname, String nachname,boolean weiblich, boolean eltern, int alter, String beruf, double einkommen){
        super(vorname,nachname,weiblich, eltern, alter);
        this.beruf = beruf;
        this.einkommen = einkommen;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public double getEinkommen() {
        return einkommen;
    }

    public void setEinkommen(double einkommen) {
        this.einkommen = einkommen;
    }

    //Methode für Eltern-Class schreiben
    //Interface => Methode taschengeld

}
