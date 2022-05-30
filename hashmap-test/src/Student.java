public class Student {

    private String vorname, name;
    private int matrikelnummer;

    public Student(String vorname, String name, int matrikelnummer){
        this.vorname = vorname;
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String toString() {
        return
              vorname + " " +
                name + " " +
                matrikelnummer;
    }
}
