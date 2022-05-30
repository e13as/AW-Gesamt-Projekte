package com.example.blog.controller;

import com.example.blog.model.Beitrag;
import com.example.blog.service.BeitragService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BeitragController {

    @Autowired
    private BeitragService beitragService;

    // Beitragsliste anzeigen lassen
    @GetMapping("/")
    public String zeigeHomePage(Model model){
        model.addAttribute("beitragsListe",beitragService.getAlleBeitraege());
        return "index";
    }

    @GetMapping("/newBeitragForm")
    public String zeigeBeitragForm(Model model){
        // Model Attribut erstellen um Formular einzubinden
        Beitrag beitrag = new Beitrag();
        model.addAttribute("beitrag", beitrag);
        return "neuer_beitrag";
    }

    @PostMapping("/speicherbeitrag")
    public String speicherBeitrag(@ModelAttribute Beitrag beitrag){
        // Beitrag in der Datenbank speichern
        beitragService.saveBeitrag(beitrag);
        return "redirect:/";
    }

    @GetMapping("/updateForm/{id}")
    public String updateForm(@PathVariable long id, Model model){

        //Beitrag vom Service holen
        Beitrag beitrag = beitragService.getBeitragById(id);

        // Beitrag als Modelattribut erstellen um Update-Formular vorbefüllen zu lassen
        model.addAttribute("beitrag", beitrag);
        return "update_beitrag";
    }

    @GetMapping("/deleteForm/{id}")
    public String entferneBeitrag(@PathVariable long id){
        // deleteBeitragById Methode aufrufen
        this.beitragService.deleteBeitragById(id);
        return "redirect:/";
    }
}
