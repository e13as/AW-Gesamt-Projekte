package de.awacademy.kitchen;

public final class BreadSlice {
    boolean toasted = false;

    Butter butter;
    Marmalade marmalade;
    Cheese cheese;

    public BreadSlice() {
    }

    public void putOn(Cheese cheese) {
        this.cheese = cheese;
    }
}
