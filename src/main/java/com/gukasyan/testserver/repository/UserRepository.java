package com.gukasyan.testserver.repository;

import com.gukasyan.testserver.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByName(String name);
}
