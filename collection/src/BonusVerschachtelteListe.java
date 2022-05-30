import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BonusVerschachtelteListe {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();

        a.add("Ben");
        a.add("Beate");
        a.add("Bernd");

        b.add("Anja");
        b.add("Alex");
        b.add("Andrea");



        c.add("Celina");
        c.add("Cem");


        System.out.println(namen(a, b, c));


    }

    public static List<List<String>> namen(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c) {
        List<List<String>> namen = new ArrayList<>();
        namen.add(a);
        namen.add(b);
        namen.add(c);

        for (List<String> newList : namen) {
            newList.sort(null);
        }

//        int x = 5;
//        switch (x) {
//            case 1 -> {
//                System.out.println("123");
//                System.out.println("123");
//            }
//            case 2 -> System.out.println(423);
//            case 5 -> System.out.println("1523");
//        }

        namen.sort(Comparator.comparing(arrayListN -> arrayListN.get(0)));
        return namen;
    }
}
