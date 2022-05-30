package de.awacademy.kitchen;

public final class WaterBoiler extends WaterContainer {

    WaterBoiler() {
        super(2000);
    }

    /**
     * Boil water to 100°C. This takes 1 minute per 200 mL of water
     */
    public void boil() {
        int amount = this.water.getAmount();
        use(amount * 5 * 60);
        this.water = new Water(amount, 100);
    }

    /**
     * Pour out the water. This takes 1 second per 50 mL.
     * @return the drained water
     */
    public Water pourOut() {
        Water water = this.water;
        this.water = null;
        use(water.getAmount() * 20);
        return water;
    }
}
