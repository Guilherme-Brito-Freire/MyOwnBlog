package com.guilhermebritofreire.my_own_blog.domains.article;

import com.guilhermebritofreire.my_own_blog.models.ArticleModel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    // Pages

    @GetMapping
    public String indexArticlePage(Model model, @RequestParam String articleId) {
        Optional<ArticleModel> article = Optional.ofNullable(articleService.getById(articleId));
        if (article.isEmpty()){
            return "redirect:/";
        }
        model.addAttribute("article", article.get());
        return "pages/article/index";
    }

    // Operational

    @DeleteMapping("/remove")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Object> deleteArticle(@RequestParam String articleId) {
        articleService.delete(articleId);

        HttpHeaders headers = new HttpHeaders();
        headers.add("HX-Redirect", "/");

        return new ResponseEntity<>(headers, HttpStatus.OK);
    }

}