package com.gukasyan.testserver.service;

import com.gukasyan.testserver.models.Test;
import com.gukasyan.testserver.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestDao {

    @Autowired
    private TestRepository repository;

    public void save(Test test) {
        repository.save(test);
    }

    public void delete(Test test) {
        repository.delete(test);
    }

    public List<Test> getAllTests() {
        List<Test> tests = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(tests::add);
        return tests;
    }
}
