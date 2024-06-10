package com.gukasyan.testserver.repository;

import com.gukasyan.testserver.models.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Integer> {
}
