package de.awacademy.assessment;

import de.awacademy.space.Astronaut;
import de.awacademy.test.Test;

public class Aufgabe1 {

    public static boolean isSecure(String password) {
        if(password.length() > 7 && !(password.contains(" ")))
            if (password.matches(".*[0-9].*") || password.contains("!")){
                return true;
            }
        return false;
    }

    public static boolean hasSecurePassword(Astronaut astronaut) {
        return isSecure(astronaut.getPassword());

    }

    public static void main(String[] args) {

        /*
            Aufgabe 1a: Implementiere in der Methode isSecure die Prüfung, ob ein gegebenes
            Passwort sicher genug ist. Die Methode muss true zurückgeben, wenn das Password
            sicher ist und false andernfalls.

            Ein Passwort ist sicher genug, wenn alle folgenden Kriterien erfüllt sind:
             - mindestens 8 Zeichen lang
             - enthält entweder eine Ziffer oder ein Ausrufezeichen
             - enthält kein Leerzeichen
         */

        // Beispiele für Passwörter, welche sicher genug sind
        Test.equals(true, isSecure("Hamster1"));
        Test.equals(true, isSecure("842geHeim"));
        Test.equals(true, isSecure("YouCanNotGuessThis!"));

        // Beispiele für Passwörter, welche nicht sicher genug sind
        Test.equals(false, isSecure("you can guess this"));
        Test.equals(false, isSecure("password"));
        Test.equals(false, isSecure("Pasw0rd"));



        /*
            Aufgabe 1b: Implementiere die Methode hasSecurePassword, welche für ein gebenes
            Astronaut-Objekt überprüft, ob das darin enthaltene Passwort sicher genug ist.
            Nutze dafür die in Aufgabe 1a implementierte Methode.
            Die Methode muss true zurückgeben, wenn das Password sicher ist und false anderfalls.
         */

        // Beispiele für Astronauten mit sicheren Passwörtern
        Test.equals(true, hasSecurePassword(new Astronaut("Yelena", "Laika0055")));
        Test.equals(true, hasSecurePassword(new Astronaut("Janice", "4234seCCret")));
        Test.equals(true, hasSecurePassword(new Astronaut("Mary", "opiuasf!!nKLJASD")));

        // Beispiele für Astronauten mit unsicheren Passwörtern
        Test.equals(false, hasSecurePassword(new Astronaut("Judith", "HackMe...")));
        Test.equals(false, hasSecurePassword(new Astronaut("Barbara", "aA0")));
        Test.equals(false, hasSecurePassword(new Astronaut("Ulf", "mein geheimnis")));

    }
}
