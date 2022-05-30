package de.awacademy.meinersterwebserver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MeinController {
    private List<Gaestebuch> alleEintraege = new ArrayList<>();

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Das ist die erste Seite meines ersten Web Servers, juhuuuuuuuuuu";
    }

    @GetMapping("/hallo")
    @ResponseBody
    public String kurzeBegruessung(@RequestParam String name, String nachricht) {
        return "Hallo " + name + " " + nachricht;
    }


    @GetMapping("/servus")
    public String namaste(Model model) {
        String indischeBegruessung = "Vanakkam Prakash";
        model.addAttribute("begruessung", indischeBegruessung);
        return "begruessungTemplate";
    }

    @GetMapping("/form")
    public String gaestebuchFormular(Model model) {
        model.addAttribute("gaestebuch", new Gaestebuch());
        return "formular";
    }

    @PostMapping("/liste")
    public String gaestebuchDatenAbschicken(@ModelAttribute Gaestebuch gaestebuch, Model model) {
        gaestebuch.setId(alleEintraege.size());
        alleEintraege.add(gaestebuch);
        model.addAttribute("gaestebuchliste", alleEintraege);
        return "ergebnis";
    }

    @GetMapping("/{id}/detail")
    public String eintragDetails(Model model, @PathVariable int id){
        model.addAttribute("eintragDetails", alleEintraege.get(id));
        return "eintragDetails";
    }


}
