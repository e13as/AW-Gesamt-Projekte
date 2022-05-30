import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        trenner("Aufgabe 1");
        char[] zeichenKette = {'J', 'a', 'v', 'a', '-', 'K', 'u', 'r', 's'};

        for (int i = zeichenKette.length - 1; i >= 0; i--) {
            System.out.print(zeichenKette[i] + " ");

        }

        trenner("Aufgabe 2");
        for (int i = 0; i < zeichenKette.length; i++) {
            if (i % 2 == 0)
                System.out.print(zeichenKette[i]);

        }

        trenner("Aufgabe 3");
        String zeichen = new String(zeichenKette);
        System.out.println(zeichen);

        trenner("Aufgabe 3 als StringBuilder");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < zeichenKette.length; i++) {
            stringBuilder.append(zeichenKette[i]);
        }
        System.out.print(stringBuilder);


        trenner("Aufgabe 4");
        String unsereNamen = "Pia-Prakash-Elias";
        char[] buchstaben = unsereNamen.toCharArray();
        System.out.println(buchstaben);
        for (char buchstabe : buchstaben) {
            System.out.println(buchstabe);
        }
        trenner("Nochmal Aufgabe 4");
        System.out.println(Arrays.toString(buchstaben));

        trenner("Aufgabe 5");
        String nums = "1, 2, 4, 9, 8, 7, 6, 4, 1";
        String[] zahlen = nums.split(",");
        int[] zahlenArray = new int[zahlen.length];
        for (int i = 0; i < zahlen.length; i++) {
            zahlenArray[i] = Integer.parseInt(zahlen[i].strip());
        }
        System.out.println(Arrays.toString(zahlenArray));

        trenner("Aufgabe 6");

        for (int zeile = 0; zeile < 16; zeile++) {

            for (int spalte = 0; spalte < 8; spalte++) {
                if (spalte + 8 * zeile > 32 && spalte + 8 * zeile < 127) {
                    System.out.print(((char) (spalte + 8 * zeile)) + "  ");
                } else System.out.print(".  ");
            }
            System.out.println();

        }

        trenner("Name to Hexa");
        String str = "Elias";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            String hexStr = Integer.toHexString(c[i]);
            System.out.print(hexStr);
        }

        trenner("BonusAufgabe");
        for (int rows = 0;rows<16;rows++){
            for (int columns = 0; columns < 8; columns++) {
                if ((columns+(8*rows))>32 && (columns+(8*rows)<127)){
                    System.out.print((char) ((columns+(8*rows))) + "\t"+(Integer.toHexString((columns+(8*rows))))+"\t"
                            +Integer.toBinaryString((columns+(8*rows)))+"\t");
                }else System.out.print(".\t\t\t\t");
            }
            System.out.println();
        }

        trenner("Eingabevalidierung");
        System.out.println("Bitte geben Sie Ihren Namen ein: ");
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        //System.out.println(eingabe.length() > 5 ? "OK" : "Eingabefehler");
        //System.out.println(eingabe.length() >= 4 && eingabe.length() <= 8 ? "OK" : "Eingabefehler");
        System.out.println(Character.isDigit(eingabe.charAt(0)) &&
                Character.isDigit(eingabe.charAt(1)) ? "OK" : "Eingabefehler");














    }

    public static void trenner(String text){
        System.out.println("\n_-_-_" + text + "_-_-_");
    }
}
