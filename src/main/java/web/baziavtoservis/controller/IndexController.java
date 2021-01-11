package web.baziavtoservis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import web.baziavtoservis.entities.Avtomobil;
import web.baziavtoservis.entities.Defekt;
import web.baziavtoservis.repository.AvtomobilRepository;
import web.baziavtoservis.repository.DefektRepository;

@Controller
public class IndexController {

    @Autowired
    AvtomobilRepository avtomobilRepository;

    @Autowired
    DefektRepository defektRepository;

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/novAvtomobilForm")
    public String showAvtomobilForm(Model model) {
        model.addAttribute("model", new Avtomobil());
        return "NovAvtomobilForm";
    }

    @GetMapping("/novDefektForm")
    public String showDefektForm(Model model) {
        model.addAttribute("model", new Defekt());
        return "NovDefektForm";
    }

    @PostMapping("/create")
    public String saveAvtomobil(Avtomobil avtomobil) {
        avtomobilRepository.save(avtomobil);
        return "index";
    }

    @PostMapping("/createDefekt")
    public String saveDefekt(Defekt defekt) {
        defektRepository.save(defekt);
        return "index";
    }
}
