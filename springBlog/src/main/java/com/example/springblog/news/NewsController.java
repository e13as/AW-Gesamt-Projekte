package com.example.springblog.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewsController {

    private final NewsRepository newsRepository;

    @Autowired
    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @GetMapping("/")
    public String homePage(Model model){
        NewsDTO news = new NewsDTO("");
        model.addAttribute("newsDTO",news);
        return "home";
    }

    @PostMapping("/result")
    public String result(@ModelAttribute NewsDTO newsDTO, Model model){
        News news = new News(newsDTO.getNews());
        newsRepository.save(news);
        model.addAttribute("news", newsRepository.findAll());
        return "result";
    }


}
