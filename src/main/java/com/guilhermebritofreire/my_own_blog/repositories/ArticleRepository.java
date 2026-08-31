package com.guilhermebritofreire.my_own_blog.repositories;

import com.guilhermebritofreire.my_own_blog.models.ArticleModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<ArticleModel, String> {
}
