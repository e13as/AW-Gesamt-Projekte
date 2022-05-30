package vorbereitung_checkpoint.kurs;

public class JavaTraining extends Kurs {

    public JavaTraining(int jahr, int kursNr) {
        super("Java Training " + jahr + "-" + kursNr);
    }

    @Override
    public void begruessung() {
        if (!this.hasTrainer()) {
            throw new TrainerMissingException("Es ist noch kein Java-Trainer im Kurs!");
        }
        System.out.println("Guten Morgen Java-Fans! Hat eure Motivation wieder eine NullPointerException?");
    }
}
