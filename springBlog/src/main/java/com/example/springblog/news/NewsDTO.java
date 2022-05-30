package com.example.springblog.news;

public class NewsDTO {

    private String news;

    public NewsDTO(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
