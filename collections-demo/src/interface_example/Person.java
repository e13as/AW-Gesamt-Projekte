package interface_example;

import java.util.Objects;

public class Person implements LivingBeing {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void breathe() {
        System.out.println("Einatmen ---- Ausatmen");
    }

    /**
     * Checks if the given Object o is equal to the person this method is called on.
     * <p>
     * In this special case, two persons are identical if they have the same name.
     *
     * @param o other Object
     *
     * @return true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }


}
