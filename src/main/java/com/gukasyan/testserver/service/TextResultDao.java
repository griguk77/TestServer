package com.gukasyan.testserver.service;

import com.gukasyan.testserver.models.TextResult;
import com.gukasyan.testserver.repository.TextResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextResultDao {

    @Autowired
    private TextResultRepository repository;

    public void save(TextResult textResult) {
        repository.save(textResult);
    }

    public void delete(TextResult textResult) {
        repository.delete(textResult);
    }

    public List<TextResult> getAllTextResults() {
        List<TextResult> textResults = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(textResults::add);
        return textResults;
    }
}
