package com.gukasyan.testserver.service;

import com.gukasyan.testserver.models.Result;
import com.gukasyan.testserver.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultDao {

    @Autowired
    private ResultRepository repository;

    public void save(Result result) {
        repository.save(result);
    }

    public void delete(Result result) {
        repository.delete(result);
    }

    public List<Result> getAllResults() {
        List<Result> results = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(results::add);
        return results;
    }

    public List<Result> findResultsByUserName(String userName) {
        return repository.findResultsByUserName(userName);
    }
}
