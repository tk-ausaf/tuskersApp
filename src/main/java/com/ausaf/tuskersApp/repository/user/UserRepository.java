package com.ausaf.tuskersApp.repository.user;

import com.ausaf.tuskersApp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    User findByName(String name);
}
