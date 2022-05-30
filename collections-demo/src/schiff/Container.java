package schiff;

public class Container {

    private final int length;

    /**
     * weight of the container in kg
     */
    private int weight;
    private String zielHafen;
    private String heimatHafen;

    public Container(int length, String homePort, String destinationPort) {
        this.length = length;
        this.heimatHafen = homePort;
        this.zielHafen = destinationPort;
    }

    public int addWeigth(int weight) {
        return this.weight += weight;
    }

    public int removeWeight(int weight) {
        return this.weight -= weight;
    }

    public int getLength() {
        return length;
    }

    /**
     * Returns the weight of the container in kg
     * @return weight in kg
     */
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getZielHafen() {
        return zielHafen;
    }

    public void setZielHafen(String zielHafen) {
        this.zielHafen = zielHafen;
    }

    public String getHeimatHafen() {
        return heimatHafen;
    }

    public void setHeimatHafen(String heimatHafen) {
        this.heimatHafen = heimatHafen;
    }

    @Override
    public String toString() {
        return "Container{" +
                "length=" + length +
                ", weight=" + weight +
                ", heimatHafen='" + heimatHafen + '\'' +
                ", zielHafen='" + zielHafen + '\'' +
                '}';
    }
}
