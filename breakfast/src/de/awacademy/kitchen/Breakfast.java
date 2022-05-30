package de.awacademy.kitchen;

import java.time.Duration;
import java.time.LocalDateTime;

public final class Breakfast {

    static final int TIMEWARP = 60;
    private LocalDateTime start = LocalDateTime.now();

    private Utensils utensils = new Utensils();

    public Utensils getUtensils() {
        return utensils;
    }

    public class Utensils {
        private Spoon spoon = new Spoon();
        private WaterBoiler waterBoiler = new WaterBoiler();
        private Cup cup = new Cup();
        private WaterTap waterTap = new WaterTap();
        private Knife knife = new Knife();
        private Toaster toaster = new Toaster();
        private Pot pot = new Pot();

        public Spoon getSpoon() {
            return spoon;
        }

        public WaterBoiler getWaterBoiler() {
            return waterBoiler;
        }

        public Cup getCup() {
            return cup;
        }

        public WaterTap getWaterTap() {
            return waterTap;
        }

        public Knife getKnife() {
            return knife;
        }

        public Toaster getToaster() {
            return toaster;
        }

        public Pot getPot() {
            return pot;
        }

        private Utensils() {}
    }

    static void check(boolean condition, String message) {
        if (!condition) {
            throw new BreakfastError(message);
        }
    }

    public void ready(Cup teaCup, BreadSlice marmaladeToast, BreadSlice cheeseToast, Egg hardBoiledEgg, ApplePiece[] applePieces) {
        check(teaCup.water != null, "No water in Cup");
        check(teaCup.water.getAmount() == 250, "Cup is not full");
        check(teaCup.teaBrewn, "There was no teabag in water");
        check(teaCup.milk != null, "I would like tea with milk, please");
        check(teaCup.sugar != null, "I would like tea with sugar, please");
        check(teaCup.stirred, "Pleas stir tea with milk and sugar");
        System.out.println("✔️ Tea OK");

        check(marmaladeToast.toasted, "My marmalade bread is not crunchy.");
        check(marmaladeToast.butter != null, "I would like butter on my marmalade bread, please!");
        check(marmaladeToast.marmalade != null, "Marmalade is mussing");
        check(marmaladeToast.cheese == null, "Cheese on a marmalade toast? Actually delicious, but too daring here!");
        System.out.println("✔️ Marmalade toast OK");

        check(cheeseToast.toasted, "My chesse bread is not crunchy.");
        check(cheeseToast.butter != null, "I would like butter on my cheese bread, plase!");
        check(cheeseToast.cheese != null, "Cheese is missing.");
        check(cheeseToast.butter != marmaladeToast.butter, "Too frugal! Two different pieces of butter, please! ");
        check(cheeseToast.marmalade == null, "Marmalade on a cheese toast? Actually delicious, but too daring here!");
        System.out.println("✔️ Cheese toast OK");

        check(hardBoiledEgg.hardBoiled, "Egg is not hard boiled.");
        System.out.println("✔️ hard boiled Egg OK");

        check(applePieces.length == 6, "I would like exactly six apple pieces");
        for (ApplePiece applePiece : applePieces) {
            check(applePiece != null, "There is an apple piece missing");
            check(applePiece.washed, "This apple piece is not washed");
        }
        System.out.println("✔️ apple pieces OK");

        float duration = Duration.between(start, LocalDateTime.now()).toMillis() / 60000f * (float)TIMEWARP;
        System.out.println("\uD83D\uDE0B Breakfast ready after " + duration + " minutes");
    }

    static class BreakfastError extends RuntimeException {
        BreakfastError(String message) {
            super(message);
        }
    }
}
