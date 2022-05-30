package vorbereitung_checkpoint.person;

public class Trainer extends Person implements Administrator {

    public Trainer(String name) {
        super(name);
    }

    @Override
    public void starteTraining() {
        System.out.println("Oops, schon so spät. Wir starten jetzt besser!");
    }

    @Override
    public void beendeTraining() {
        System.out.println("Ach, wir machen heute mal etwas früher Schluß. Schönen Feierabend!");
    }

    @Override
    public String vorstellung() {
        return super.vorstellung().toLowerCase();
    }
}
