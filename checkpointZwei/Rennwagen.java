package Test;

public class Rennwagen extends Auto {
    /**
     *
     * @param name
     * @param geschwindigkeit
     */
    public Rennwagen(String name, double geschwindigkeit) {
        super(name, geschwindigkeit);
    }

    /**
     * @return
     */
    @Override
    public String getName() {
        return super.getName().toUpperCase();
    }

    /**
     *
     */
    @Override
    public void signal() {
        System.out.println("Wroom,Wroom");
    }
}
