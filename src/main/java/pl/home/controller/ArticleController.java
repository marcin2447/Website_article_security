package pl.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.home.model.Article;

@Controller
public class ArticleController {
 
    @PostMapping("/add")
    public String addArticle(@ModelAttribute Article Articlef, Model model) {
        if(checkNotEmpty(Articlef)) {
            model.addAttribute("Articlef", Articlef);
            return "success";
        } else
            return "redirect:sorry";
    }
     
    @GetMapping("/sorry")
    public String error() {
        return "error";
    }
     
    private boolean checkNotEmpty(Article article) {
        return (article.getTitle()!=null && article.getTitle().length()>0)
                && (article.getContent()!=null && article.getContent().length()>0);
    }
}