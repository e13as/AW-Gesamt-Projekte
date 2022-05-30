package de.awacademy.space;

public class Astronaut {

    private final String name;
    private final String password;

    public Astronaut(String name) {
        this.name = name;
        this.password = "";
    }

    public Astronaut(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Astronaut{" +
                "name='" + name + '\'' +
                '}';
    }
}
