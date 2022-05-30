public class Loewe implements Tier {
    String name;
    int alter;
    String land;

    public Loewe(String name, int alter, String land){
        this.name = name;
        this.alter = alter;
        this.land = land;
    }
    @Override
    public String essen(String essen){
        return name + " isst gerne " + essen;
    }
    @Override
    public String schlafen(String schlafdauer){
        return name + " ist ein " + schlafdauer + "schläfer";
    }


}
