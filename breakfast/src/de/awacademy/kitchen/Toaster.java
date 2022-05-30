package de.awacademy.kitchen;

public final class Toaster extends Utensil {
    Toaster() {
    }

    /**
     * Toasts the BreadSlice. Takes 15 seconds.
     *
     * @param breadSlice BreadSlice to toast
     */
    public void toast(BreadSlice breadSlice) {
        Breakfast.check(breadSlice.marmalade == null, "Marmalade in Toaster - what a mess");
        Breakfast.check(breadSlice.cheese == null, "Cheese in Toaster - what a mess");
        Breakfast.check(breadSlice.butter == null, "Butter in Toaster - what a mess");
        use(15 * 1000);
        breadSlice.toasted = true;
    }
}
