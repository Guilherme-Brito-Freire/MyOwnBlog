package com.guilhermebritofreire.my_own_blog.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("preferencesBlog")
@Data
public class PreferencesModel {
    @Id
    private String id;

    private String blogName;
    private boolean defaultTheme;
    private String introMessage;

    // Constructors

    public PreferencesModel(String id, String blogName, boolean defaultTheme, String introMessage) {
        this.id = id;
        this.blogName = blogName;
        this.defaultTheme = defaultTheme;
        this.introMessage = introMessage;
    }

    public PreferencesModel() {}
}
