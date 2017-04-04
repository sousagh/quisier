package com.quisier.repository;

import com.quisier.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by gustavosousa on 4/3/17.
 */
public interface UserRepository extends MongoRepository<User, String> {

     User findByEmail(String email);

     User findByEmailAndPassword(String email, String password);
}
