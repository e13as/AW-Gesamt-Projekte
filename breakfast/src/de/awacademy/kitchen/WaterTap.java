package de.awacademy.kitchen;

public final class WaterTap extends Utensil {

    /**
     * Get water from the tap. This takes 1 second per 50 mL. The water always has 10°C.
     *
     * @param amount amount of water (in mL)
     * @return Water
     */
    public Water getWater(int amount) {
        use(amount * 20);
        return new Water(amount, 10);
    }

    /**
     * Wash apple. Takes 30 seconds.
     *
     * @param apple the apple to be washed
     */
    public void wash(Apple apple) {
        use(30 * 1000);
        apple.washed = true;
    }
}
