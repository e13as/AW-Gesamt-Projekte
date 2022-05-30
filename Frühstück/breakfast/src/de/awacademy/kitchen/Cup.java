package de.awacademy.kitchen;

public final class Cup extends WaterContainer {

    Sugar sugar = null;
    Milk milk = null;

    boolean stirred = false;

    boolean teaBrewn = false;

    Cup() {
        super(250);
    }

    public void pourIn(Milk milk) {
        this.milk = milk;
    }

    /**
     * Takes 4 minutes
     * @param teaBag The tea bag
     */
    public void letTeaBrew(TeaBag teaBag) {
        Breakfast.check(this.water != null, "No water in cup");
        Breakfast.check(this.water.getTemperature() == 100, "Tea water not boiling");
        use(4 * 60 * 1000);
        this.teaBrewn = true;
        this.stirred = false;
    }

    @Override
    public void pourIn(Water water) {
        super.pourIn(water);
        this.stirred = false;
    }
}
