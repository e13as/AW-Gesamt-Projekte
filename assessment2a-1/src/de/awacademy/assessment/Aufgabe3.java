package de.awacademy.assessment;

import de.awacademy.space.Astronaut;
import de.awacademy.space.Mission;
import de.awacademy.space.Spaceship;
import de.awacademy.test.Test;

public class Aufgabe3 {

    public static void main(String[] args) {

        /*
            Aufgabe 3: Erstelle eine Klasse, welche die Informationen zu einer
            Mission zusammenfasst: Raumschiff, Gewicht der Fracht und Astronauten
            der Crew.

            Folge den Schritten hier und entferne die // um deinen Code zu testen!
         */

        /*
            (a) Das Raumschiff muss im Konstruktor übergeben werden. Es muss dafür
            eine Getter-Methode geben.
         */
        Spaceship ariane = new Spaceship("ariane", 150f, 3, 4000);
        Mission m1 = new Mission(ariane);
        Test.equals(ariane, m1.getSpaceship());

        /*
            (b) Das Gewicht der Fracht (Datentyp int) ist über Getter- und Setter-
            Methoden zugänglich. Der Standardwert ist 0.
         */
        Test.equals(0, m1.getCargoWeight());
        m1.setCargoWeight(100);
        Test.equals(100, m1.getCargoWeight());

        /*
            (c) Die Crew wird in der Mission als Collection der Astronaut-Objekte
            gespeichert. Wähle eine geeignete Collection-Klasse aus und implementiere
            die folgenden Methoden. Dabei sollte die Collection als Implementierungs-
            detail nicht von außen sichtbar sein.

            Die Methode addCrewMember fügt einen Astronauten zur Crew hinzu. Falls
            der gegebene Astronaut bereits in der Crew ist, soll er kein zweites Mal
            eingetragen werden (Collection ohne Duplikate).

            Die Methode getCewSize gibt die Anzahl der Crew-Mitglieder zurück.

            Die Methode removeCrewMember entfernt den gegebenen Astronauten aus der
            Crew.
         */
        /* Crew ist zu Beginn leer */
        Test.equals(0, m1.getCrewSize());

        Astronaut a1 = new Astronaut("a1");
        Astronaut a2 = new Astronaut("a2");

        /* erstes Crew-Mitglied */
        m1.addCrewMember(a1);
        Test.equals(1, m1.getCrewSize());

        /* zweites Crew-Mitglied */
        m1.addCrewMember(a2);
        Test.equals(2, m1.getCrewSize());

        /* a1 erneut hinzufügen - keine Auswirkung */
        m1.addCrewMember(a1);
        Test.equals(2, m1.getCrewSize());

        /* a2 entfernen */
        m1.removeCrewMember(a2);
        Test.equals(1, m1.getCrewSize());


        /*
            (d) Die Methode checkLaunchPermission prüft die Informationen zur Mission
            und gibt true oder false zurück, wenn die Mission starten kann oder nicht.

            Eine Mission kann starten wenn alle folgenden Bedingungen erfüllt sind:
            - Es ist mindestens ein Astronaut in der Crew
            - Die Größe der Crew überschreitet nicht die Crew-Kapazität des Raumschiffs
            - Das Gewicht von Fracht und Crew überschreitet nicht das maximale Ladegewicht
              des Raumschiffs (maxLoadWeight). Hierbei wird für jedes Crew-Mitglied ein
              pauschales Gewicht von 100 berechnet.
         */
        Test.equals(true, m1.checkLaunchPermission());

        Spaceship dragon = new Spaceship("dragon", 25f, 2, 1600);
        Astronaut a3 = new Astronaut("a3");

        Mission m2 = new Mission(dragon);

        /* kein Astronaut */
        Test.equals(false, m2.checkLaunchPermission());

        m2.addCrewMember(a1);
        m2.addCrewMember(a2);
        m2.addCrewMember(a3);

        /* zu viele Astronauten */
        Test.equals(false, m2.checkLaunchPermission());

        m2.removeCrewMember(a3);

        m2.setCargoWeight(1450);
        /* zu schwer */
        Test.equals(false, m2.checkLaunchPermission());

        m2.setCargoWeight(1400);

        /* 1400 Frachtgewicht und 200 Crewgewicht, passt genau */
        Test.equals(true, m2.checkLaunchPermission());
    }

}
