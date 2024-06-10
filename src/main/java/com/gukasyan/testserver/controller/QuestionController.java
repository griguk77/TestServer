package com.gukasyan.testserver.controller;

import com.gukasyan.testserver.models.Question;
import com.gukasyan.testserver.service.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionDao questionDao;

    @GetMapping("/question/get-all")
    public List<Question> getQuestions() {
        return questionDao.getAllQuestions();
    }

    @PostMapping("/question/save")
    public void save(@RequestBody Question question) {
        questionDao.save(question);
    }

    @PostMapping("/question/delete")
    public void delete(@RequestBody Question question) {
        questionDao.delete(question);
    }
}
