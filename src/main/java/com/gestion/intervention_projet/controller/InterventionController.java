package com.gestion.intervention_projet.controller;

import com.gestion.intervention_projet.entity.Intervention;
import com.gestion.intervention_projet.service.InterventionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller

public class InterventionController {
    @Autowired
    private InterventionServiceImpl interventionServiceImpl;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", interventionServiceImpl.getAllIntervention());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNewEmployee(Model model) {
        Intervention intervention = new Intervention();
        model.addAttribute("employee", intervention);
        return "newEmploye";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("intervention") Intervention intervention) {
        interventionServiceImpl.save(intervention);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        Intervention intervention = interventionServiceImpl.getById(id);
        model.addAttribute("intervention", intervention);
        return "update";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        interventionServiceImpl.deleteViaId(id);
        return "redirect:/";

    }
}
