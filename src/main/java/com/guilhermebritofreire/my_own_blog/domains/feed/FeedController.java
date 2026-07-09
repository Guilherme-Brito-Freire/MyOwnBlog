package com.guilhermebritofreire.my_own_blog.domains.feed;

import com.guilhermebritofreire.my_own_blog.models.ArticleModel;
import com.guilhermebritofreire.my_own_blog.repositories.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class FeedController {

    private final FeedService feedService;

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("posts", feedService.findAll());
        return "pages/index";
    }

    // About Feed Creation

    @GetMapping("/admin/add") // Creation Page
    public String addANewPostPage(Model model) {
        return "pages/newPost";
    }

    @PostMapping("/admin/add") // Creation Page
    public String addANewPostForm(ArticleModel reqBody) {

        feedService.save(reqBody);

        return "redirect:/";
    }

}
