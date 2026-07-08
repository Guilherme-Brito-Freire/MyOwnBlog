package com.guilhermebritofreire.my_own_blog.repositories;

import com.guilhermebritofreire.my_own_blog.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserModel, String> {
    Optional<UserModel> findByUsername(String username);
}
