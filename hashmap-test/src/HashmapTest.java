import java.util.*;
import java.io.*;

public class HashmapTest {

    public static void main(String[] args) {

        // HashMap hashMap = new HashMap();
        // HashMap<Integer,Student> hashMap = new LinkedHashMap();
        List liste = new ArrayList<>();
        Set set = new HashSet();



        Student pia = new Student("Pia", "Stitzing", 101341);
        Student mehmet = new Student("Mehmet", "Katran", 20403596);
        Student prakash = new Student("Prakash", "Rathinasamy", 804436);
        Student elias = new Student("Elias", "Akbari", 2301519);
        Student alex = new Student("Alex", "Hoffmann", 601575);
        Student anja = new Student("Anja", "Schiebel", 305070);

        set.add(pia);
        set.add(elias);
        set.add(mehmet);
        set.add(prakash);

        System.out.println(set);
       set.add(elias);
        System.out.println(set);



        liste.add(pia);
        liste.add(prakash);
        liste.add(mehmet);
        liste.add(elias);

        System.out.println(liste);
        liste.add(mehmet);
        System.out.println(liste);


        // Objekte in die Hashmap hinzufügen
        // key, value
//        hashMap.put(pia.getMatrikelnummer(),pia);
//        hashMap.put(mehmet.getMatrikelnummer(),mehmet);
//        hashMap.put(prakash.getMatrikelnummer(),prakash);
//        hashMap.put(elias.getMatrikelnummer(),elias);
//        hashMap.put(alex.getMatrikelnummer(),alex);
//        hashMap.put(anja.getMatrikelnummer(),anja);


        // System.out.println(hashMap.entrySet().stream().filter(e -> e.getKey() == 804436).map(HashMap.Entry::getValue).findFirst().get());
//        hashMap.forEach((k, v) -> {
//            String text = k == 804436? k + " = " + v : "nicht gefunden";
//           System.out.println(text);
//            if (k==804436 ){
//                System.out.println(k + " = " + v);
//            }
//
//        });


    }
}
