public class Horse extends Animal{

    public Horse(int health){
        super(health);
    }

    @Override
    public void run(int km){
        System.out.println(km + "km gelaufen");
    }
}
