package com.guilhermebritofreire.my_own_blog.domains.feed;

import com.guilhermebritofreire.my_own_blog.models.ArticleModel;
import com.guilhermebritofreire.my_own_blog.repositories.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/")
@AllArgsConstructor
public class FeedController {

    private final ArticleRepository articleRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", articleRepository.findAll());
        return "pages/index";
    }

    // About Feed Creation

    @GetMapping("/admin/add") // Creation Page
    public String addANewPost(Model model) {
        return "pages/newPost";
    }

    @PostMapping("/admin/add") // Creation Page
    public String addANewPostForm(ArticleModel reqBody) {

        articleRepository.save(reqBody);

        return "redirect:/";
    }

}
