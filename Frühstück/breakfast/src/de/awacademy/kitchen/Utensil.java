package de.awacademy.kitchen;

class Utensil {

    private boolean inUse = false;

    protected synchronized void lock() {
        if (inUse) {
            throw new Breakfast.BreakfastError(this.getClass().getSimpleName() + " is alread in use!");
        }
        inUse = true;
    }

    protected synchronized void release() {
        inUse = false;
    }

    protected void use(int milliSeconds) {
        lock();
        System.out.println("Using " + this.getClass().getSimpleName() + " for " + (milliSeconds / 1000) + "s");
        try {
            Thread.sleep(milliSeconds / Breakfast.TIMEWARP);
        } catch (InterruptedException e) {
            throw new Breakfast.BreakfastError("Thread interrupted");
        }
        release();
    }

    Utensil() {
    }
}
