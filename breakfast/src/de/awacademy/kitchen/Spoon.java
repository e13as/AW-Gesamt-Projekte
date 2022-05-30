package de.awacademy.kitchen;

public final class Spoon extends Utensil {

    Spoon() {
    }

    public void stir(Cup cup) {
        use(15 * 1000);
        cup.stirred = true;
    }

    public void spoon(Sugar sugar, Cup cup) {
        use(15 * 1000);
        cup.sugar = sugar;
        cup.stirred = false;
    }

    public void spoon(Marmalade marmalade, BreadSlice breadSlice) {
        use(15 * 1000);
        breadSlice.marmalade = marmalade;
    }
}
