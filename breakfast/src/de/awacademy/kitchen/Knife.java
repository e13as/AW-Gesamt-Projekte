package de.awacademy.kitchen;

public final class Knife extends Utensil {
    Knife() {
    }

    /**
     * Cuts an apple into 6 pieces. Takes 2 minutes.
     *
     * @param apple the apple to be cut
     * @return array of 6 apple pieces
     */
    public ApplePiece[] cut(Apple apple) {
        use(2 * 60 * 1000);
        return new ApplePiece[]{
                new ApplePiece(apple.washed),
                new ApplePiece(apple.washed),
                new ApplePiece(apple.washed),
                new ApplePiece(apple.washed),
                new ApplePiece(apple.washed),
                new ApplePiece(apple.washed),
        };
    }

    /**
     * Smear butter on a bread. Takes 30 seconds.
     *
     * @param butter The Butter
     * @param bread   The BreadSlice
     */
    public void smear(Butter butter, BreadSlice bread) {
        Breakfast.check(bread.cheese == null, "Butter goes on the bread before cheese");
        Breakfast.check(bread.marmalade == null, "Butter muss goes on the bread before marmalade");
        use(30 * 1000);
        bread.butter = butter;
    }
}
