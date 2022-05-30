import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FehlerBehandlung {

    public static void main(String[] args) {

        System.out.println("************ Aufgabe 1: *************\n");
        uncheckedNull();

        System.out.println("************ Aufgabe 2: *************\n");
        try {
            dateiZugriff();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }

    public static void uncheckedNull() {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Dein String hat keinen Wert zugewiesen bekommen");
        }

    }

    private static int dateiZugriff() throws IOException {

        boolean dateiKannNichtGeoeffnetWerden = false;

        if (!dateiKannNichtGeoeffnetWerden) {
            throw new IOException("Dateizugriff unmöglich");
        } else {
            System.out.println("Dateizugriff erfolgreich");
        }
        return 0;
    }
}
