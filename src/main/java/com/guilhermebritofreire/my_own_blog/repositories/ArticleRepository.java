package com.guilhermebritofreire.my_own_blog.repositories;

import com.guilhermebritofreire.my_own_blog.models.ArticleModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends MongoRepository<ArticleModel, String> {
}
