package de.awacademy.kitchen;

public class WaterContainer extends Utensil {

    private final int volume;
    Water water = null;

    WaterContainer(int volume) {
        this.volume = volume;
    }

    public void pourIn(Water water) {
        int menge = Math.min(water.getAmount(), volume);
        water.remove(menge);
        this.water = new Water(menge, water.getTemperature());
    }

    public int getVolume() {
        return volume;
    }
}
