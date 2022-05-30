package interface_example;

public class Pet implements LivingBeing {

    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public void breathe() {
        System.out.println("wwoooof ------ woooof");
    }
}
