package vorbereitung_checkpoint;

import vorbereitung_checkpoint.kurs.DevOpsTraining;
import vorbereitung_checkpoint.kurs.JavaScriptTraining;
import vorbereitung_checkpoint.kurs.JavaTraining;
import vorbereitung_checkpoint.kurs.Kurs;
import vorbereitung_checkpoint.person.ProgramManager;
import vorbereitung_checkpoint.person.Teilnehmer;
import vorbereitung_checkpoint.person.Trainer;

import java.time.LocalDate;

public class Academy {

    public static void main(String[] args) {

        Trainer t1 = new Trainer("Georg");
        Trainer t2 = new Trainer("Alex");
        Trainer t3 = new Trainer("Florian");

        ProgramManager p1 = new ProgramManager("Lucas");
        ProgramManager p2 = new ProgramManager("Myriam");

        Teilnehmer consultant1 = new Teilnehmer("Bob");
        Teilnehmer consultant2 = new Teilnehmer("Jane");
        Teilnehmer consultant3 = new Teilnehmer("John");
        Teilnehmer consultant4 = new Teilnehmer("Alice");
        Teilnehmer consultant5 = new Teilnehmer("Peter");
        Teilnehmer consultant6 = new Teilnehmer("Sarah");
        Teilnehmer consultant7 = new Teilnehmer("Frank");
        Teilnehmer consultant8 = new Teilnehmer("Stephanie");
        Teilnehmer consultant9 = new Teilnehmer("Kurt");
        Teilnehmer consultant10 = new Teilnehmer("Maria");


        Kurs java = new JavaTraining(2022, 2);
        java.addTrainer(t1);
        java.addTrainer(t2);
        java.addTrainer(t3);
        java.addProgramManager(p1);
        java.addProgramManager(p2);

        Kurs devOps = new DevOpsTraining(2021, 4);
        devOps.addProgramManager(p1);

        Kurs js = new JavaScriptTraining(2022, 1);
        js.addProgramManager(p2);

        java.addTeilnehmer(consultant1);
        java.addTeilnehmer(consultant2);
        java.addTeilnehmer(consultant3);
        java.addTeilnehmer(consultant4);

        java.setStartDate(LocalDate.of(2022, 3, 1));

        /* CODE_STELLE 1 (siehe Aufgabe.md) */


        t1.starteTraining();


        /* CODE_STELLE 2 (siehe Aufgabe.md) */
        System.out.println(t1.vorstellung());

        t1.beendeTraining();

    }
}
