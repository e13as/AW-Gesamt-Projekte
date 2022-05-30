package com.example.springblog.news;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class News {

    @Id
    @GeneratedValue
    private long id;

    private String news;

    private final Date date = new Date();

    public News(){}

    public News(String news) {
        this.news = news;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public Date getDate() {
        return date;
    }

    public String getDateString(){
        return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date);
    }
}
