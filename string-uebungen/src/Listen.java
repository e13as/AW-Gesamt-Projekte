import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listen {

    public static void main(String[] args) {

        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> listB = Arrays.asList(4, 5, 6, 7, 8, 9);

        List<Integer> vereinigung = new ArrayList<>();
        vereinigung.addAll(listB);
        for (Integer elem : listA) {
            if (!vereinigung.contains(elem)) {
                vereinigung.add(elem);
            }
        }
        Collections.sort(vereinigung);
        System.out.println("Vereinigung" + vereinigung);

        List<Integer> schnittmenge = new ArrayList<>();
        for (Integer elem : listA) {
            if (listB.contains(elem)) {
                schnittmenge.add(elem);
            }
        }

        System.out.println("Schnittmenge" + schnittmenge);

        List<Integer> differenz = new ArrayList<>();
        for (Integer elem : listA) {
            if (!listB.contains(elem)) {
                differenz.add(elem);
            }
        }
        for (Integer elem : listB) {
            if (!listA.contains(elem)) {
                differenz.add(elem);
            }
        }
        System.out.println(differenz);
    }
}

