import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GanzeZahlen {

    public static void main(String[] args) {

        List<Integer> ganzeZahlen = new ArrayList<>();

        for (int i = 10; i < 21; i++) {
            ganzeZahlen.add(i);
        }

        removeOddNumbers(ganzeZahlen);
    }

    public static int getMax(List<Integer> integerList) {
        int maximum = Integer.MIN_VALUE;

        for (int number : integerList) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }


    public static void removeOddNumbers(List<Integer> integerList) {

        System.out.println("Before: " + integerList);

        for (int number : integerList) {
            if (number % 2 != 0) {
                integerList.remove(number);
            }
        }

        System.out.println("After: " +integerList);

    }


    public static int getMaxWithFor(List<Integer> integerList) {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > maximum) {
                maximum = integerList.get(i);
            }
        }
        return maximum;
    }

    public static void alleGeradenZahlen(List<Integer> integerList) {
        List<Integer> alleGeradeZahlen = new ArrayList<>();

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) {
                alleGeradeZahlen.add(integerList.get(i));
            }
        }
        System.out.println(alleGeradeZahlen);
    }

    public static void alleGeradenZahlenForEach(List<Integer> integerList) {
        List<Integer> alleGeradeZahlen = new ArrayList<>();
        for (int zahl : integerList) {
            if (zahl % 2 == 0) {
                alleGeradeZahlen.add(zahl);
                System.out.println(zahl);
            }
        }

        System.out.println("alleGeradeZahlen = " + alleGeradeZahlen);
    }

    public static void alleGeradenZahlenWithStream(List<Integer> integerList) {

        integerList.removeIf(number -> number % 2 != 00);


        List<Integer> evenNumbers = integerList.stream()
                .filter(number -> number % 2 == 0)
                .toList();


        System.out.println("evenNumbers = " + evenNumbers);

        System.out.println("integerList = " + integerList);
    }


    public List<Integer> createList(int min, int max) {
        List<Integer> list = new ArrayList<>();


        for (int i = min; i < max; i++) {
            list.add(i);
        }

        return list;



    }


}
