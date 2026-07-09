package com.guilhermebritofreire.my_own_blog.domains.article;

import com.guilhermebritofreire.my_own_blog.models.ArticleModel;
import com.guilhermebritofreire.my_own_blog.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Nullable
    public ArticleModel getById(String id){

        // Validate if exist in DB
        if(id.isEmpty()){
            return null;
        }
        Optional<ArticleModel> articleModel = articleRepository.findById(id);
        return articleModel.orElse(null);
    }

    public void delete(String id){
        Optional<ArticleModel> model = articleRepository.findById(id);
        model.ifPresent(articleRepository::delete);
    }

}
