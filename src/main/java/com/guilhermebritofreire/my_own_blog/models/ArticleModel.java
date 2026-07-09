package com.guilhermebritofreire.my_own_blog.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("posts")
@Data
public class ArticleModel {
    @Id
    private String id;
    private String name;
    private String description;
    private String content;
}
