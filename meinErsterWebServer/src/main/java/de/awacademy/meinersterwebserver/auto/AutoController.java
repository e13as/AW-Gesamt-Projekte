package de.awacademy.meinersterwebserver.auto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AutoController {

    @GetMapping("/carform")
    public String autoForm(Model model){
        Auto auto = new Auto();
        auto.setMarke("BMW");

        model.addAttribute("auto", auto);
        return "autoForm";
    }

    @PostMapping("/message")
    public String autosubmit(@Valid @ModelAttribute Auto auto, BindingResult bindingResult){    //hier holen wir uns Model mit dem AutoObjekt aus Zeile 17
        if(bindingResult.hasErrors()){
            return "autoForm";
        }
        return "autoSubmit";
    }
}
