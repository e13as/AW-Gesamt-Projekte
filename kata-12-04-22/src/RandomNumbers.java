import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    List<Integer> randomIntegerNumbers = new ArrayList<>();

    //Methode erstellt eine Liste von fünf zufälligen ganzen Zählen (0-100)
    public List<Integer> createListOfFiveRandomIntegers() {
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            randomIntegerNumbers.add(rd.nextInt(0,100));
        }
        return randomIntegerNumbers;
    }

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        List<Integer> testList = rn.createListOfFiveRandomIntegers(); // Populate the list using the Method
        System.out.println("Original List: " + testList);                          // Print out the original list
        Collections.sort(testList);                            // Sort the list using Collections.sort
        System.out.println("Sorted List: " + testList);                          // Print out the sorted list
    }
}
