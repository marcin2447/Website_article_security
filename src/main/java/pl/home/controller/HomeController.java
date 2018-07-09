package pl.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.home.model.Article;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("helloMessage", "Please add article!");
        model.addAttribute("Articlef", new Article("Add title", "Please add content", "Add tags")  );
        return "index";
    }
}