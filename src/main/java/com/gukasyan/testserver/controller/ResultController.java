package com.gukasyan.testserver.controller;

import com.gukasyan.testserver.models.Result;
import com.gukasyan.testserver.service.ResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultController {

    @Autowired
    private ResultDao resultDao;

    @GetMapping("/result/get-all")
    public List<Result> getResults() {
        return resultDao.getAllResults();
    }

    @PostMapping("/result/save")
    public void save(@RequestBody Result result) {
        resultDao.save(result);
    }

    @PostMapping("/result/delete")
    public void delete(@RequestBody Result result) {
        resultDao.delete(result);
    }

    @GetMapping("/result/get-by-userName")
    public List<Result> getResultsByUserName(@RequestParam(value = "userName", required = false) String userName) {
        return resultDao.findResultsByUserName(userName);
    }
}
