package com.gukasyan.testserver.repository;

import com.gukasyan.testserver.models.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends CrudRepository<Result, Integer> {
    List<Result> findResultsByUserName(String userName);
}
