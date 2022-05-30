import java.time.Instant;
import java.util.Arrays;

public class GeradeZahlen {

    public static void main(String[] args) {

        int[] eingabe = {1, 3, 2, 4, 5, 9, 6, 12, 102, 101};  //[x,x,x,x,x]
        // System.out.println(Arrays.toString(geradeZahlen(eingabe)));
        // System.out.println(Arrays.toString(geradeZahlenSTR(eingabe)));

        primZahlen();

        System.out.println("_________________________________________________________");
        Instant now = Instant.now();
        System.out.println(now);




    }

    public static int[] geradeZahlen(int[] input) {

        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int z = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                result[z] = input[i];
                z++;
            }
        }
        return result;
    }

    public static String[] geradeZahlenSTR(int[] input) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                stringBuilder.append(input[i] + " ");
            }
        }
        String[] geradeZahlen = stringBuilder.toString().split(" ");
        return geradeZahlen;
    }

    public static void primZahlen() {

        for (int i = 2; i <= 10; i++) {
            for (int j = 0; j < i; j++) {


            }
            System.out.println(i);
        }

    }


}
