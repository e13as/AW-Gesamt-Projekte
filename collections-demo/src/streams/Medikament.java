package streams;

public class Medikament {

    private String name;

    // 0 --> schlecht
    // 10 --> top
    private int wirksamkeit;

    public Medikament(String name, int wirksamkeit) {
        this.name = name;
        this.wirksamkeit = wirksamkeit;
    }

    public String getName() {
        return name;
    }

    public int getWirksamkeit() {
        return wirksamkeit;
    }

    @Override
    public String toString() {
        return "Medikament{" +
                "name='" + name + '\'' +
                ", wirksamkeit=" + wirksamkeit +
                '}';
    }
}
