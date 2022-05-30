import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionLernen {

    public static void main(String[] args) {

        //list.get(i) -> ary[i]
        //Niemals in einer Schleife die Liste verändern (Elemente löschen etc.) lieber eine leere neue Liste erstellen

        List<Integer> ganzeZahlen = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ganzeZahlen.add(i + 1);
        }
        ganzeZahlen.add(300_000_008);

        List<Integer> andereZahlen = new ArrayList<>();
        andereZahlen.add(150);
        andereZahlen.add(25987);
        andereZahlen.add(7);
        andereZahlen.add(-5684);
        andereZahlen.add(2);


        System.out.println("Max:");
        System.out.println("ArrayList: ganzeZahlen -> "+max(ganzeZahlen));
        System.out.println("ArrayList: andereZahlen -> "+max(andereZahlen));


        System.out.println("\nEvenNums: ");
        evenNums(ganzeZahlen);
        System.out.println("\nArrayList: andereZahlen: ");
        evenNums(andereZahlen);

        System.out.println("\nMaxCollection: ");
        System.out.println("ganzeZahlen: " + maxColl(ganzeZahlen));
        System.out.println("andereZahlen: " + maxColl(andereZahlen));
    }

    public static int max(List<Integer> liste){
        int max = Integer.MIN_VALUE;
        for (int num: liste ) {
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    public static int maxColl(List<Integer> liste){
        return Collections.max(liste);
    }

    public static void evenNums(List<Integer> liste){
       List<Integer> evenNumbers = new ArrayList<>();
        for (int num: liste) {
            if (num%2==0){
                evenNumbers.add(num);
            }
        }
        System.out.println(evenNumbers);
    }
}