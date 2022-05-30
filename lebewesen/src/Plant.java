public class Plant extends Livingbeing{

    private boolean deco;

    public Plant(String name){
        super(name);
        this.deco = false;
    }

    @Override
    public void atmen(){
        System.out.println("durch die Blätter...");
    }





}
