package com.example.vereinsmanager.sportbeitrag;

import javax.persistence.*;


@Entity
public class Sportbeitrag {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String content;

    public Sportbeitrag(){}

    public Sportbeitrag(String title, String content){
        this.title = title;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
