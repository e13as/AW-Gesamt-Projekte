package schiff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {

        Container c1 = new Container(700, "Hamburg", "Rotterdam");
        Container c2 = new Container(750, "Hamburg", "Bremen");

        // 'old-school' example with Arrays: 
        Container[] containers = new Container[500]; // we reserve 500 fields in our array. this is fixed now!
        containers[0] = c1;
        containers[499] = c2;

        // shrink array
        Container[] containersShrinked = new Container[2]; // we create a new array with only two fields
        
        containersShrinked[0] = containers[0];
        containersShrinked[1] = containers[499];


        Container[] containersGrown = new Container[1_000]; // we create a new array with 1_000 fields

        // we copy our existing array with 500 fields to the new array with 1000 fields
        System.arraycopy(containers, 0, containersGrown, 0, containers.length);

        // alternative with for loop:
        for (int i = 0; i < containers.length; i++) {
            containersGrown[i] = containers[i];
        }


        // if we want to do something with every container in our container array,
        // we might get a null pointer exception if the array is not 'full'
        for (Container container : containers) {
            if (container != null) {
                // without the null-check we would get an exception for container[1] - container[498]:
                // Cannot invoke "schiff.Container.getHeimatHafen()" because "container" is null at schiff.Main.main(Main.java:40)
                System.out.println("Container from " + container.getHeimatHafen() + " to " + container.getZielHafen());
            }
        }

        System.out.println("\n");


        // The new kid in town: List!
        List<Container> containerList = new ArrayList<>(); // we don't have to decide how many container have a place in our list!

        Container c3 = new Container(700, "Hamburg", "Panama");
        Container c4 = new Container(700, "Hamburg", "Odessa");
        Container c5 = new Container(700, "Hamburg", "Panama");

        // we can add new elements (objects of the type 'Container' in this case) to the list.
        // the list implementation chooses the correct index for new elements.
        containerList.add(c1);
        containerList.add(c2);
        containerList.add(c3);
        containerList.add(c4);
        containerList.add(c5);

        // We can use a for-each loop just like with arrays
        for (Container container : containerList) {
            System.out.println(container);
        }

        System.out.println("\n");

        // We don't have to be scared of empty lists and NullPointerExceptions!
        List<Container> emptyList = new ArrayList<>();
        for (Container container : emptyList) {
            System.out.println("We will never see this text here! {" + container + "}");
        }


        // We can use any Object as a type for our lists:
        //
        //    Type of elements in the list
        //     ⬇️
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hallo");
        arrayList.add("World");
        arrayList.add("Hallo"); // we can add duplicate items
        System.out.println("arrayList before removing items: " + arrayList);

        arrayList.remove(1); // we can remove items at a specific index, items after this index are shift to a new position
        System.out.println("arrayList after removing item at index 1: " + arrayList);

        // we can remove specific items by calling remove with an object, the first occurrence of the object will be deleted
        arrayList.remove("Hallo");
        System.out.println("arrayList after removing \"Hallo\" " + arrayList);

        arrayList.remove("Hallo");
        System.out.println("arrayList after removing \"Hallo\" again " + arrayList);
        System.out.println("\n");

        // for primitive types (int, long, byte, double, float, short, boolean) we have to use their Wrapper classes

        //     int -> Integer
        //     ⬇️
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(123); // 0
        linkedList.add(456); // 1
        linkedList.add(789); // 2
        linkedList.add(987); // 3
        linkedList.add(654); // 4
        linkedList.add(321); // 5


        // for list operations, there are many useful methods available
        // e.g. .sublist() returns a list starting from the index of the
        // first parameter (3 in this case) to the second parameter (.size() in this case)
        List<Integer> sublist = linkedList.subList(3, linkedList.size());
        System.out.println("sublist = " + sublist);
        System.out.println("\n");


        // we can quickly create lists with List.of(..,.....)
        // BUT: Lists created with List.of() are immutable, we can not add new elements to these lists!
        List<String> stringList = List.of("Hallo", "Welt");
        // stringList.add("Not possible!");


    }


    //                       always use the interface List instead of their implementations (ArrayList, LinkedList, ...)!
    //                            ⬇️
    public static void printList(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }


}
