public class Katze implements Tier{

    private String name;
    private double speed;

    public Katze(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void essen() {
        System.out.println("Katzenfutter");
    }

    @Override
    public void bewegen() {
        System.out.println("Schnell und leise");
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

      /* public Tier fastestAnimal() {
        Tier fastest = tierList
                        .stream()
                .max(Comparator.comparing(Tier::getSpeed)).orElseThrow();
        return fastest;
    }*/

    @Override
    public String toString() {
        return "Katze{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
