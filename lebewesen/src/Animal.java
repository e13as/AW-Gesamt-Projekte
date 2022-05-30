public class Animal extends Livingbeing {

    private boolean eatable;
    private int numOfLegs;

    public Animal(String name, int numOfLegs){
        super(name);
        this.numOfLegs = numOfLegs;
        this.eatable = false;
    }

    public void isEatable(boolean eatable) {
        this.eatable = eatable;
    }

    @Override
    public void atmen(){
        System.out.println("Auuuuuuuuuuuuuuuuuuuuuuuu...");
    }



}
