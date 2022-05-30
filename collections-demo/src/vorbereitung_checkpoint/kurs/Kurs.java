package vorbereitung_checkpoint.kurs;

import vorbereitung_checkpoint.person.ProgramManager;
import vorbereitung_checkpoint.person.Teilnehmer;
import vorbereitung_checkpoint.person.Trainer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Kurs {

    private String name;

    private final Set<Trainer> trainer = new HashSet<>();

    private final Set<ProgramManager> programManagers = new HashSet<>();

    private final Set<Teilnehmer> teilnehmer = new HashSet<>();

    private LocalDate startDate;
    private LocalDate endDate;

    public Kurs(String name) {
        this.name = name;
    }

    public abstract void begruessung() throws TrainerMissingException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        if (this.endDate != null && this.endDate.isBefore(startDate)) {
            throw new EndBeforeStartException();
        }
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        if (this.startDate != null && this.startDate.isAfter(endDate)) {
            throw new EndBeforeStartException();
        }
        this.endDate = endDate;
    }

    public void addTrainer(Trainer trainer) {
        this.trainer.add(trainer);
    }

    public void removeTrainer(Trainer trainer) {
        this.trainer.remove(trainer);
    }

    public void addProgramManager(ProgramManager programManager) {
        this.programManagers.add(programManager);
    }

    public void removeProgramManager(ProgramManager programManager) {
        this.programManagers.remove(programManager);
    }

    public boolean hasTrainer() {
        return this.trainer.size() > 0;
    }

    public void addTeilnehmer(Teilnehmer teilnehmer) {
        this.teilnehmer.add(teilnehmer);
    }

    public void removeTeilnehmer(Teilnehmer teilnehmer) {
        this.teilnehmer.remove(teilnehmer);
    }
}
