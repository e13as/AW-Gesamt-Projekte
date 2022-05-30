package de.awacademy.assessment;

import de.awacademy.shop.Category;
import de.awacademy.shop.Product;
import de.awacademy.test.Test;

public class Aufgabe1 {

    public static boolean isValidProductId(String productId) {

           boolean commonProperty = productId.length() > 1 && productId.length() < 7 && productId.substring(1).matches("[0-9]*");
        // boolean commonProperty = productId.length() > 1 && productId.substring(1).matches("[0-9]{1,5}");
        // boolean commonProperty = productId.length() > 1 &&  productId.length() < 7 && productId.substring(1).matches("\\d*");

            if (productId.startsWith("D")) {
                if (commonProperty){
                    if (Integer.parseInt(productId.substring(1)) % 3 == 0){
                        return true;
                    }
                }
            } else if (productId.startsWith("F")) {
                if (commonProperty){
                    if (Integer.parseInt(productId.substring(1)) % 5 == 0){
                        return true;
                    }
                }
            }
        return false;
    }

    public static boolean hasValidId(Product product) {
        if (isValidProductId(product.getId())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        /*
            Aufgabe 1a: Implementiere in der Methode isValidProductId die Prüfung,
            ob ein gegebener String eine gültige Produkt-ID ist. Die Methode muss
            true zurückgeben, wenn es sich um eine gültige Produkt-ID handelt und
            fallse andernfalls.

            Jede gültige Produkt-ID beginnt mit dem Großbuchstaben D oder F, gefolgt
            von einer Zahl mit mindestens einer und höchstens fünf Ziffern.

            Falls der Buchstabe D ist, muss die Zahl durch drei teilbar ist, falls
            der Buchstabe F ist, so muss die Zahl durch fünf teilbar sein.
         */

        System.out.println("Aufgabe 1a");
        // Beispiele für gültige Produkt-IDs
        Test.equals(true, isValidProductId("D6"));
        Test.equals(true, isValidProductId("F10"));
        Test.equals(true, isValidProductId("D24"));
        Test.equals(true, isValidProductId("F250"));
        Test.equals(true, isValidProductId("D30000"));
        Test.equals(true, isValidProductId("F30000"));

        // Beispiele für ungültige Produkt-IDs
        Test.equals(false, isValidProductId(""));
        Test.equals(false, isValidProductId("6D"));
        Test.equals(false, isValidProductId("F"));
        Test.equals(false, isValidProductId("Hallo"));
        Test.equals(false, isValidProductId("F 10"));
        Test.equals(false, isValidProductId("D24 "));
        Test.equals(false, isValidProductId("D-24"));
        Test.equals(false, isValidProductId("d24"));
        Test.equals(false, isValidProductId("F300000"));


        /*
            Aufgabe 1b: Implementiere die Methode hasValidId, welche für ein gegebenes
            Product-Objekt überprüft, ob die darin enthaltene ID gültig ist.

            Nutze dafür die in Aufgabe 1a implementierte Methode.

            Die Methode muss true zurückgeben, wenn die ID gültig ist und false anderfalls.
         */

        System.out.println("Aufgabe 1b");
        // Beispiele für Produkte mit gültigen IDs
        Test.equals(true, hasValidId(new Product("F25", "Tomato", Category.FOOD)));
        Test.equals(true, hasValidId(new Product("D240", "Java", Category.SOFTWARE)));
        Test.equals(true, hasValidId(new Product("F1000", "Shirt", Category.CLOTHES)));
        Test.equals(true, hasValidId(new Product("Test Product", Category.TOOLS)));

        // Beispiele für Produkte mit ungültigen IDs
        Test.equals(false, hasValidId(new Product("P25", "Pineapple", Category.FOOD)));
        Test.equals(false, hasValidId(new Product("D241", "Word", Category.SOFTWARE)));
        Test.equals(false, hasValidId(new Product("no-id", "Skirt", Category.CLOTHES)));
    }

}
