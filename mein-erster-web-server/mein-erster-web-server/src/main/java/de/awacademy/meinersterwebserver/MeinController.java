package de.awacademy.meinersterwebserver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MeinController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "True Crime Is Awesome!";
    }

    @GetMapping("/hallo")
    @ResponseBody
    public String hallo(@RequestParam String name, String essen) {
        return "Hallo " + name + ", du isst gerne " + essen;
    }

    @GetMapping("/greeting")
    public String getGreeting(Model model) {
        String hello = "Guten Tag";
        model.addAttribute("greeting", hello);
        return "greetingTemplate";
    }
    @GetMapping("/lieblingsessensliste")
    public String lieblingsessen(Model model){
        List<String> favefood = Arrays.asList("Pizza", "Pasta", "Döner");
        model.addAttribute("lieblingsessensliste", favefood);
        return "top3";
    }

}