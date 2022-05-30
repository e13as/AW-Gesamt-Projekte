package de.awacademy.kitchen;

public final class Pot extends WaterContainer {

    Pot() {
        super(500);
    }

    /**
     * Heats water to 100°C. This takes 90 seconds per 100 mL of water
     */
    public void boilWater() {
        Breakfast.check(this.water != null, "There is no water in the pot");
        int amount = this.water.getAmount();
        use(amount * 10 * 90);
        this.water = new Water(amount, 100);
    }

    /**
     * Hard boils an egg. The pot must be full (500mL) with boiling water. Takes 7 minutes.
     *
     * @param egg The egg to be boiled
     */
    public void boilEgg(Egg egg) {
        Breakfast.check(this.water != null, "No water in pot");
        Breakfast.check(this.water.getTemperature() == 100, "Water in pot not boiling");
        Breakfast.check(!egg.hardBoiled, "Egg is cooked aleady.");
        use(7 * 60 * 1000);
        egg.hardBoiled = true;
    }
}
