public class Dog extends Animal {

    private String name;


    public Dog (int health, String name){
        super(health);
        this.name = name;
    }

    @Override
    public void run(int km){
        System.out.println(km + "km gelaufen");
    }
}
