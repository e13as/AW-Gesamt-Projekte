public class Hund implements Tier{

    private String name;
    private double speed;

    public Hund(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }
    @Override
    public void essen() {
        System.out.println("Hundefutter");
    }

    @Override
    public void bewegen() {
        System.out.println("Wie ein Blitz");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Hund{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
