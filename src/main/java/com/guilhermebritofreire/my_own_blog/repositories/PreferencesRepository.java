package com.guilhermebritofreire.my_own_blog.repositories;
import com.guilhermebritofreire.my_own_blog.models.PreferencesModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PreferencesRepository extends MongoRepository<PreferencesModel, String> {
}
