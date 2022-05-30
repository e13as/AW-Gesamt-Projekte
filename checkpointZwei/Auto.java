package Test;

public class Auto implements Fahrzeug {
    private String name;
    private double geschwindigkeit;
    private double kilometerstand;

    public Auto(String name, double geschwindigkeit) {
        this.name = name;
        this.geschwindigkeit = geschwindigkeit;
        this.kilometerstand = 0.0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void signal() {
        System.out.println("Möp, Möp");

    }
    @Override
    public double fahre(double distanz) {
        return (distanz/geschwindigkeit)*3600;
    }
    public double getKilometerstand() {
        return this.kilometerstand;
    }
}
