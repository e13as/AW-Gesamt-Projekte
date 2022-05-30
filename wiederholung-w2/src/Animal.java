public abstract class Animal {

    // Do not modify this file!

    private int health;

    public Animal(int health) {
        this.health = health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract void run(int km);
}
