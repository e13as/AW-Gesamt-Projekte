package com.example.vereinsmanager;

import com.example.vereinsmanager.sportbeitrag.Sportbeitrag;
import com.example.vereinsmanager.sportbeitrag.SportbeitragDTO;
import com.example.vereinsmanager.sportbeitrag.SportbeitragRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class indexController {

// "@RequestParam" um von client side values zu übermitteln
//    @GetMapping("/")
//    @ResponseBody
//    public String index(@RequestParam String name){
//        return "Das ist die Homeseite von " + name;
//    }

    private SportbeitragRepository sportbeitragRepository;

    @Autowired
    public indexController(SportbeitragRepository sportbeitragRepository) {
        this.sportbeitragRepository = sportbeitragRepository;
    }

    @GetMapping("/")
    public String index(Model model){
        String jvHello = "Hallo Welt!";
        model.addAttribute("attrNameHtml", jvHello);       // Thymeleaf:  jv <-Model für Datenübertragung-> Html
        return "index";
    }


    //Sportbeiträge Datenbank kommunikation


    @GetMapping("/sportbeitraege")
    public String  sportFormular(Model model){
        //model.addAttribute("sportFormular", new Sportbeitrag());
        model.addAttribute("sportFormular", new SportbeitragDTO());

        return "sportNews";
    }

    @PostMapping("/sportbeitraege")
    public String sportEintragSubmit(@ModelAttribute SportbeitragDTO sportbeitragDTO, Model model){
        model.addAttribute("sportFormular1", sportbeitragDTO);
        Sportbeitrag sportbeitrag = new Sportbeitrag(sportbeitragDTO.getTitleDTO(), sportbeitragDTO.getContentDTO());
        sportbeitragRepository.save(sportbeitrag);
        return "index";
    }
}
