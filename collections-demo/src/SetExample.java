import interface_example.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Hallo");
        stringSet.add("Hallo");
        stringSet.add("World");
        stringSet.add("Hallo");
        // was enthält stringSet jetzt?

        //System.out.println("stringSet: " + stringSet);

        Person bob = new Person("Bob");
        Person bob2 = new Person("bob");
        Person bigBob = new Person("BOB");

       // System.out.println("bigBob.equals(bob2) = " + bigBob.equals(bob2));


        Person jane = new Person("Jane");
        Person jane2 = new Person("Jane");

        Set<Person> personSet = new HashSet<>();

        String hallo = "Hallo";
        String halloLowercase = hallo.toLowerCase();

       // System.out.println("jane.equals(\"Jane\") = " + jane.equals("Jane"));

        personSet.add(bob); // neu
        personSet.add(bob); // kenn ich schon
        personSet.add(jane); // neu
        personSet.add(jane2); // kenn ich schon
        personSet.add(bob); // kenn ich schon
        personSet.add(bob2); // kenn ich schon
        personSet.add(bigBob); // kenn ich schon
        // was enthält personSet jetzt?

        //System.out.println("personSet: " + personSet);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Hallo");
        hashSet.add("Aber");

        System.out.println("hashSet = " + hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Hallo");
        treeSet.add("Aber");


        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(5);
        integers.add(2);

        System.out.println("integers: " + integers);


        System.out.println("treeSet: " + treeSet);

        Set<Object> doNotDoThis = new HashSet();

        doNotDoThis.add("Hallo");
        doNotDoThis.add(jane);
        doNotDoThis.add(1);


    }
}
