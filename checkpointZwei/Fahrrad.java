package Test;

public class Fahrrad implements Fahrzeug {

    private String name;
    private double geschwindigkeit;

    /**
     *
     * @param name
     * @param geschwindigkeit
     */
    public Fahrrad(String name, double geschwindigkeit) {
        this.name = name;
        this.geschwindigkeit = geschwindigkeit;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void signal() {
        System.out.println("Klingeling!");
    }

    @Override
    public double fahre(double distanz) {
        return (distanz/geschwindigkeit)*3600;
    }
}
