package com.gukasyan.testserver.service;

import com.gukasyan.testserver.models.Question;
import com.gukasyan.testserver.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionDao {

    @Autowired
    private QuestionRepository repository;

    public void save(Question question) {
        repository.save(question);
    }

    public void delete(Question question) {
        repository.delete(question);
    }

    public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(questions::add);
        return questions;
    }
}
