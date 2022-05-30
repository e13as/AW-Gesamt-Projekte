package Test;

public class Main {
    public static void main(String[] args) {

        Rennen academyGrandPrix = new Rennen(50.0);

        Fahrrad rennRad = new Fahrrad("Blauer Flitzer", 27.0);
        Fahrrad supermansRad = new Fahrrad("Superman's Test.Fahrrad",170.0);
        Auto golf = new Auto("Alter Golf", 90.0);
        Auto mcQueen = new Auto("Test.Rennen-Semmmel",125.0);
        Rennwagen lightning = new Rennwagen("Lightning McQueen", 150.0);

        academyGrandPrix.teilnehmerRegistrieren(rennRad);
        academyGrandPrix.teilnehmerRegistrieren(supermansRad);
        academyGrandPrix.teilnehmerRegistrieren(golf);
        academyGrandPrix.teilnehmerRegistrieren(mcQueen);
        academyGrandPrix.teilnehmerRegistrieren(lightning);



        /* ========= Code-Stelle 1 ========== */

        academyGrandPrix.durchfuehren();


//        rennRad.fahre(academyGrandPrix);
//        System.out.println("rennRad.fahre(academyGrandPrix); = is an error because " +
//                "fahre method expects double Variable but given is Variable academyGrandprix");

//        academyGrandPrix.teilnehmerRegistrieren("Seifenkiste"); // This is not allowed
        // Required type is Fahrzeug given is String

//        academyGrandPrix.distanz = 70; // is not allowed
        // because distanz is private and it is in another class
        // if it was in the same class it would be possible to implement this
        // if made public this statement is acceptable




        Fahrzeug sieger = academyGrandPrix.getGewinner();
//        Fahrzeug sieger = golf;

        //System.out.println("Required Output: ");
        sieger.signal();
        //System.out.println(academyGrandPrix.getBestZeit());
        /* ========= Code-Stelle 2 ========== */

         System.out.println(lightning.getName());
        /* ========= Code-Stelle 3 ========== */
    }
}