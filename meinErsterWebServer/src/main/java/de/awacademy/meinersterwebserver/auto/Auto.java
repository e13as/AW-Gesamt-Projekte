package de.awacademy.meinersterwebserver.auto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Auto {
    @NotEmpty
    private String marke;
    @Min(1)
    private int leistung;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
}
