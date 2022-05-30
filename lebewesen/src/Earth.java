public class Earth {
    public static void main(String[] args) {

        Livingbeing peter = new Human("Peter", "Deutsch");
        Human mehmet = new Human("Mehmet" ,"o.N.");
        Plant appleTree = new Plant("Apple Tree");
        Animal tiger = new Animal("Tiger", 4);
        tiger.isEatable(true);
        System.out.println(mehmet.getName() + " is a "+mehmet.getClass().getName());
        System.out.println(peter.getName());
        System.out.println(mehmet.myFood("Döner"));
        Livingbeing elias = new Human("Elias" , "afghanisch");
        System.out.println(elias.getClass().getName());
        mehmet.atmen();
    }
}
