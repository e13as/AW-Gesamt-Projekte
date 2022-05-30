package de.awacademy.space;

public class Spaceship {

    private final String name;
    private final float maxSpeed;
    private final int crewCapacity;
    private final int maxLoadWeight;

    public Spaceship(String name, float maxSpeed, int crewCapacity, int maxLoadWeight) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.crewCapacity = crewCapacity;
        this.maxLoadWeight = maxLoadWeight;
    }

    public String getName() {
        return name;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "name='" + name + '\'' +
                '}';
    }
}
