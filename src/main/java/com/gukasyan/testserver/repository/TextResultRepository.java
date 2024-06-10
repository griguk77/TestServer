package com.gukasyan.testserver.repository;

import com.gukasyan.testserver.models.TextResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextResultRepository extends CrudRepository<TextResult, Integer> {
}
