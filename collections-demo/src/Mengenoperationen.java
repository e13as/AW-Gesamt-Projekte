import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mengenoperationen {

    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList (4,5,6, 1,2,3);
        List<Integer> listB = Arrays.asList (7,8,9,4,5,6);

        System.out.println("union(listA, listB) = " + union(listA, listB));

        System.out.println("intersect(listA, listB) = " + intersect(listA, listB));

        System.out.println("except(listA, listB) = " + except(listA, listB));
    }

    public static List<Integer> union(List<Integer> a, List<Integer> b) {

        List<Integer> newListVar1 = new ArrayList<>();

        // var 1
        for (int entryA : a) {
            for (int entryB : b) {
                if (!newListVar1.contains(entryA)) {
                    newListVar1.add(entryA);
                }
                if (!newListVar1.contains(entryB)) {
                    newListVar1.add(entryB);
                }
            }
        }
        Collections.sort(newListVar1);

        //return newListVar1;


        // Var 2
        List<Integer> newListVar2 = new ArrayList<>();

        for (int entry : a) {
            if (!newListVar2.contains(entry)) {
                newListVar2.add(entry);
            }
        }

        for (int entry : b) {
            if (!newListVar2.contains(entry)) {
                newListVar2.add(entry);
            }
        }

        //return newListVar2;

        // var 3

        List<Integer> integerListVar3 = new ArrayList<>(a);

//        integerListVar3.addAll(a);

        for (int entry : b) {
            if (!integerListVar3.contains(entry)) {
                integerListVar3.add(entry);
            }
        }

        return integerListVar3;


    }

    public static List<Integer> intersect(List<Integer> a, List<Integer> b) {

        // var 1
        List<Integer> c1 = new ArrayList<>();


        for (int i = 0; i < b.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) == b.get(i)) {
                    c1.add(a.get(j));
                }
            }
        }

//        return c1;


        // var 2
        List<Integer> c2 = new ArrayList<>();

        for (int element : a) {
            if (b.contains(element)) {
                c2.add(element);
            }
        }

        return c2;

    }

    public static List<Integer> except(List<Integer> a, List<Integer> b) {

        // var 1
        List<Integer> oldList = union(a, b);
        List<Integer> newList = new ArrayList<>();

        for (int element : oldList) {
            if (a.contains(element) ^ b.contains(element)) {
                newList.add(element);
            }
        }
//        return newList;


        // var 2

        List<Integer> unionList = union(a, b);
        List<Integer> intersectList = intersect(a, b);
        unionList.removeAll(intersectList);
        //return unionList;

        // var 3
        List<Integer> result = new ArrayList<>();

        for (int number : a) {
            if (!b.contains(number)) {
                result.add(number);
            }
        }

        for (int number : b) {
            if (!a.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

}
