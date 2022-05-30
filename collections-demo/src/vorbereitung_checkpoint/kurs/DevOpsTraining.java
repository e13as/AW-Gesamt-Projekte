package vorbereitung_checkpoint.kurs;

public class DevOpsTraining extends Kurs{

    public DevOpsTraining(int jahr, int kursNr) {
        super("DevOps Training " + jahr + "-" + kursNr);
    }

    @Override
    public void begruessung() {
        if (!this.hasTrainer()) {
            throw new TrainerMissingException("Es ist noch kein DevOps-Trainer im Kurs!");
        }
        System.out.println("Moin DevOps-Leute! Sind die Docker-Images schon geschlüpft und die CI/CD-Pipelines frisch geölt?");
    }
}
