package de.awacademy.assessment;

import de.awacademy.space.Spaceship;
import de.awacademy.test.Test;

import java.util.List;

public class Aufgabe2 {

    public static Spaceship getFastestSpaceship(List<Spaceship> spaceships, int crewSize) {

        // kürzere Variante
//        Spaceship theFastestSpaceship = null;
//        float maxSpeed = Float.MIN_VALUE;
//        for (Spaceship spaceship : spaceships) {
//
//            if (crewSize <= spaceship.getCrewCapacity()) {
//                if (maxSpeed < spaceship.getMaxSpeed()) {
//                    maxSpeed = spaceship.getMaxSpeed();
//                    theFastestSpaceship = spaceship;
//                }
//            }
//        }
//        return theFastestSpaceship;


        // längere Variante
        int counter = 0;
        for (Spaceship spaceship : spaceships) {
            if ((spaceship.getCrewCapacity() < crewSize)){
                counter++;
            }
        }
        if (counter == spaceships.size()){
            return null;
        }else {
            Spaceship magic = spaceships.get(0);
            float maxispeed = Float.MIN_VALUE;
            for (Spaceship spaceship : spaceships) {
                if (spaceship.getMaxSpeed() > maxispeed && spaceship.getCrewCapacity() >= crewSize) {
                    maxispeed = spaceship.getMaxSpeed();
                    magic = spaceship;
                }
            }
            return magic;
        }

    }

    public static float getTravelTime(List<Spaceship> spaceships, int crewSize, float distance) {
        int counter = 0;
        for (Spaceship spaceship : spaceships) {
            if ((spaceship.getCrewCapacity() < crewSize)){
                counter++;
            }
        }
        if (counter == spaceships.size()){
            return Float.POSITIVE_INFINITY;
        }
        float reiseDauer;
            Spaceship magic = getFastestSpaceship(spaceships, crewSize);
            reiseDauer = distance / magic.getMaxSpeed();
            return reiseDauer;
    }


    public static void main(String[] args) {
        /*
            Aufgabe 2a: Implementiere die Methode getFastestSpaceship, welche das schnellste
            Raumschiff mit der nötigen Kapazität für die Crew aus einer Liste auswählt.

            Das schnellste Raumschiff (Spaceship) ist das mit der höchsten Maximalgeschwindigkeit
            (maxSpeed). Hierbei dürfen nur Raumschiffe berücksichtigt werden, bei welchen die
            crewCapacity größer oder gleich der gegebenen crewSize ist.

            Falls kein Raumschiff mit ausreichender crewCapacity in der Liste enthalten ist, muss
            null zurück gegeben werden.
         */

        Spaceship s1 = new Spaceship("s1", 100f, 3, 2000);
        Spaceship s2 = new Spaceship("s2", 50f, 5, 3000);
        Spaceship s3 = new Spaceship("s3", 300f, 1, 4000);

        List<Spaceship> allShips = List.of(s1, s2, s3);

        Test.equals(s1, getFastestSpaceship(allShips, 3));
        Test.equals(s2, getFastestSpaceship(allShips, 5));
        Test.equals(s3, getFastestSpaceship(allShips, 1));

        Test.equals(s1, getFastestSpaceship(List.of(s1, s2), 1));
        Test.equals(s2, getFastestSpaceship(List.of(s2, s3), 3));
        Test.equals(null, getFastestSpaceship(List.of(s1, s3), 4));
        Test.equals(null, getFastestSpaceship(List.of(), 1));


        /*
            Aufgabe 2b: Implementiere die Methode getTravelTime, welche die Reisedauer berechnet,
            wenn aus einer gegebenen Liste von Raumschiffen das schnellste für die gegebene
            Crew-Größe gewählt wird und die gebene Distanz mit maximaler Geschwindigkeit
            zurückgelegt wird.

            Verwende die Methode getFastestSpaceship zur Auswahl des Raumschiffes und teile die
            gegebene Distanz durch dessen Maximalgeschwindigkeit, um die Reisedauer zu errechnen.

            Gib die Reisedauer zurück, oder Float.POSITIVE_INFINITY falls kein Raumschiff
            mit ausreichender Crew-Kapaziät in der Liste enthalten ist.
         */

        // Beispiel: Für 4 Crew-Mitglieder ist s2 das schnellste Schiff: Geschwindigkeit 50.
        // Die Distanz von 1000 wird dann in der Zeit 20 zurückgelegt.
        Test.equals(20f, getTravelTime(allShips, 4, 1000f));

        // Weitere Beispiele
        Test.equals(10f, getTravelTime(allShips, 3, 1000f));
        Test.equals(20f, getTravelTime(allShips, 1, 6000f));
        Test.equals(Float.POSITIVE_INFINITY, getTravelTime(allShips, 6, 100f));
    }
}
