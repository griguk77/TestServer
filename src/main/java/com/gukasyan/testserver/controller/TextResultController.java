package com.gukasyan.testserver.controller;

import com.gukasyan.testserver.models.TextResult;
import com.gukasyan.testserver.service.TextResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TextResultController {

    @Autowired
    private TextResultDao textResultDao;

    @GetMapping("/textResult/get-all")
    public List<TextResult> getTextResults() {
        return textResultDao.getAllTextResults();
    }

    @PostMapping("/textResult/save")
    public void save(@RequestBody TextResult textResult) {
        textResultDao.save(textResult);
    }

    @PostMapping("/textResult/delete")
    public void delete(@RequestBody TextResult textResult) {
        textResultDao.delete(textResult);
    }
}
