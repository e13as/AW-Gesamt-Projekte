package vorbereitung_checkpoint.kurs;

public class JavaScriptTraining extends Kurs{

    public JavaScriptTraining(int jahr, int kursNr) {
        super("JavaScript Training " + jahr + "-" + kursNr);
    }

    @Override
    public void begruessung() {
        if (!this.hasTrainer()) {
            throw new TrainerMissingException("Es ist noch kein JavaScript-Trainer im Kurs!");
        }
        System.out.println("Hallo JS-Geeks! Heute schon `this` falsch verwendet?");
    }
}
