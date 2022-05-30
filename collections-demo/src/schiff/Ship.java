package schiff;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private String name;
    private String destinationPort;
    private final List<Container> freight = new ArrayList<>();

    /**
     * maxWeight of the ship in tons
     */
    private final int maxWeight;

    public Ship(String name, int maxWeight) {
        this.name = name;
        this.maxWeight = maxWeight;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public void addContainer(Container container) {
        this.freight.add(container);
    }

    /**
     * Returns the maximum weight of the ship (in tons)
     * @return maximum weight
     */
    public int getMaxWeight() {
        return maxWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Container> getFreight() {
        return freight;
    }
}
