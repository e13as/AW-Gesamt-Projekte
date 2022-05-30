public abstract class Person {

    private String vorname;
    private String nachname;
    private String adresse;
    private boolean weiblich;
    private boolean nationalitaet; //Deutscher=true; sonst=false;
    private boolean eltern; //eltern = true; sonst= false;
    private int alter;

    public Person(String vorname, String nachname,boolean weiblich, boolean eltern, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.weiblich = true;
        this.eltern = true;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isWeiblich() {
        return weiblich;
    }

    public void setWeiblich(boolean weiblich) {
        this.weiblich = weiblich;
    }

    public boolean isNationalitaet() {
        return nationalitaet;
    }

    public void setNationalitaet(boolean nationalitaet) {
        this.nationalitaet = nationalitaet;
    }

    public boolean isEltern() {
        return eltern;
    }

    public void setEltern(boolean eltern) {
        this.eltern = eltern;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String essen(String essen){
        return essen + "ist fertig";
    }
}
