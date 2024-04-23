package com.assesment.dataentry.controller;

import com.assesment.dataentry.model.Entry;
import com.assesment.dataentry.service.EntryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EntryController {

    private final EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("entry", new Entry());
        model.addAttribute("entries", entryService.findAll());
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Entry entry) {
        entryService.save(entry);
        return "redirect:/confirmation";
    }

    @GetMapping("/confirmation")
    public String confirmation(Model model) {
        Entry latestEntry = entryService.findFirstByOrderByCreatedAtDesc(); // Assuming 'createdAt' field is present in Entry entity
        model.addAttribute("entry", latestEntry);
        model.addAttribute("entries", entryService.findAll());
        return "confirmation";
    }
}
