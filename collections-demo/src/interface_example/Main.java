package interface_example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // This list is "typed" to the interface "LivingBeing", so we can add all classes which implement this interface.
        List<LivingBeing> livingBeings = new ArrayList<>();

        // Person is a LivingBeing thus we can add it to the list
        livingBeings.add(new Person("Bob"));

        // Pet is a LivingBeing thus we can add it to the list
        livingBeings.add(new Pet("Bobby"));

        System.out.println("livingBeings = " + livingBeings);




        // We can also create multi-dimensional List:
        // A list which contains lists of Strings
        List<List<String>> listOfLists = new ArrayList<>();

        List<String> german = new ArrayList<>();
        german.add("Hallo");
        german.add("Tschüß");

        List<String> english = new ArrayList<>();
        english.add("Hello");
        english.add("Bye");

        // we add the list with the german words to our list of lists
        listOfLists.add(german);

        // we add the list with the english words to our list of lists
        listOfLists.add(english);

        System.out.println("listOfLists = " + listOfLists);


    }
}
