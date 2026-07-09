package com.guilhermebritofreire.my_own_blog.domains.feed;

import com.guilhermebritofreire.my_own_blog.models.ArticleModel;
import com.guilhermebritofreire.my_own_blog.repositories.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.management.ConstructorParameters;
import java.util.List;

@Service
@AllArgsConstructor
public class FeedService {

    private final ArticleRepository articleRepository;

    public List<ArticleModel> findAll() {
        return articleRepository.findAll();
    }

    public void save(ArticleModel reqBody) {
        articleRepository.save(reqBody);
    }

}
