import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MengenOperation {

    public static void main(String[] args) {

        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> listB = Arrays.asList(4, 5, 6, 7, 8, 9);

        System.out.println("ListA: " + listA);
        System.out.println("ListB: " + listB);
        System.out.println("Vereinigung:");
        System.out.println(vereinigung(listA, listB));
        System.out.println("Schnittmenge: ");
        System.out.println(schnittMenge(listA, listB));
        System.out.println(schnittmengeSchleife(listA, listB));
        System.out.println("symmetrische Differenz: ");
        System.out.println(symmetrischeDifferenz(listA, listB));
    }

    public static List<Integer> vereinigung(List<Integer> listA, List<Integer> listB) {

       List<Integer> newListC = new ArrayList<>();
       newListC.addAll(listA);
        for (int elem: listB) {
            if (!newListC.contains(elem)){
                newListC.add(elem);
            }
        }
        return newListC;
    }

    public static List<Integer> schnittMenge(List<Integer> a, List<Integer> b){
        List<Integer> newListC = new ArrayList<>();

        for (int elem: a) {
            if (b.contains(elem)){
                newListC.add(elem);
            }
        }
        return newListC;
    }

    public static List<Integer> schnittmengeSchleife(List<Integer> a, List<Integer> b){
        List<Integer> newListC = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j) == a.get(i)){
                    newListC.add(b.get(j));
                }
            }
        }
        return newListC;
    }

    public static List<Integer> symmetrischeDifferenz(List<Integer> a, List<Integer> b){
        List<Integer> c = new ArrayList<>();
        for (int elem: a) {
            if (!b.contains(elem)){
                c.add(elem);
            }
        }
        for (int elem: b) {
            if (!a.contains(elem)){
                c.add(elem);
            }
        }
        return c;
    }



}
