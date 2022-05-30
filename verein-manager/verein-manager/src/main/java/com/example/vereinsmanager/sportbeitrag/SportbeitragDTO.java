package com.example.vereinsmanager.sportbeitrag;
// DTO Data Transfer Objekt -> Wird benötigt um Daten vom Client "zwischen zu speichern"
// um sie anschließend in die Datenbank zu übertragen

public class SportbeitragDTO {

    private String titleDTO;

    private String contentDTO;

    private long id;

    public SportbeitragDTO(){}

    public SportbeitragDTO(String titleDTO, String contentDTO) {
        this.titleDTO = titleDTO;
        this.contentDTO = contentDTO;
    }

    public String getTitleDTO() {
        return titleDTO;
    }

    public String getContentDTO() {
        return contentDTO;
    }

    public long getId() {
        return id;
    }

    public void setTitleDTO(String titleDTO) {
        this.titleDTO = titleDTO;
    }

    public void setContentDTO(String contentDTO) {
        this.contentDTO = contentDTO;
    }

    public void setId(long id) {
        this.id = id;
    }
}
