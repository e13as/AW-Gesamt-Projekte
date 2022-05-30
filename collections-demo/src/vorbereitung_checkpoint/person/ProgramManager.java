package vorbereitung_checkpoint.person;

public class ProgramManager extends Person implements Administrator {

    public ProgramManager(String name) {
        super(name);
    }


    @Override
    public void starteTraining() {
        System.out.println("Wir starten jetzt!");
    }

    @Override
    public void beendeTraining() {
        System.out.println("Das war's für heute!");
    }
}
