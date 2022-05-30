package de.awacademy.fussballliga;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FussballLigaController {
    private List<Verein> vereine = new ArrayList<>();

    @GetMapping("/ligaForm")
    public String vereinsListe(Model model){
        model.addAttribute("vereinAttribut", new Verein());
        return "ligaSeite";
    }

    @PostMapping("/ligaForm")
    public String vereinErstellen(@ModelAttribute Verein verein, Model model){
        vereine.add(verein);
        model.addAttribute("vereine",vereine);

        return "vereinsListe";
    }
}
