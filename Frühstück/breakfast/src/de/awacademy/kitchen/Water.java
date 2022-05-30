package de.awacademy.kitchen;

public final class Water {

    private int amount;
    private int temperature;

    public Water(int amount, int temperature) {
        this.amount = amount;
        this.temperature = temperature;
    }

    /**
     * @return Amount in mL
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @return Temperature in °C
     */
    public int getTemperature() {
        return temperature;
    }

    synchronized void remove(int amount) {
        Breakfast.check(amount <= this.amount, "There is not enough water");
        this.amount -= amount;
    }
}
