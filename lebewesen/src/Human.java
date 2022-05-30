public class Human extends Livingbeing implements Food{

    private String nationality;
    private String emailAdress;


    public Human(String name, String nationality){
        super(name);
        this.nationality = nationality;
    }



    public void atmen(){
        System.out.println("Einatmen... Ausatmen...");
    }




    @Override
    public String myFood(String foodName){
        return this.getName() + " eats " + foodName;
    }


    public int alter(int alter){
        return alter;
    }













}
