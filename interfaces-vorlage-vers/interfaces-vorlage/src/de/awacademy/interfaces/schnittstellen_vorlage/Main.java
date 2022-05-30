package de.awacademy.interfaces.schnittstellen_vorlage;

public class Main {

    public static void main(String[] args) {

        Prozessor prozessor1= new Prozessor();
        prozessor1.id = 1;
        prozessor1.produktName = "Intel Core I7";
        prozessor1.geschwindigkeit = 3000;
        prozessor1.anzahlKerne = 2;

        Prozessor prozessor2 = new Prozessor();
        prozessor2.id = 2;
        prozessor2.produktName = "Amd threadripper";
        prozessor2.geschwindigkeit = 3500;
        prozessor2.anzahlKerne = 3;

        Tastatur tastatur = new Tastatur();
        tastatur.id = 3;
        tastatur.farbe = "dunkelgrün";
        tastatur.produktName = "Microsoft Natural keyboard";

        Monitor monitor = new Monitor();
        monitor.id = 4;
        monitor.produktName = "Samsung T191T";
        monitor.groesse = 24;
        monitor.gewicht = 5.5f;

        // TODO Aufgabe B: Lege eine Bestandsliste (Array) mit den unterschiedlichen Produkten an.
        Produkt[] bestandsliste = {prozessor1, prozessor2, tastatur, monitor};

        druckeProdukte(bestandsliste);

    }

    private static void druckeProdukte(Produkt[] produkte) {
        /* TODO Aufgabe C: Gib die Beschreibungen über eine separate Methode aus. */
        for (int i = 0; i < produkte.length; i++) {
            System.out.println(produkte[i].beschreibe());

        }

    }

}
