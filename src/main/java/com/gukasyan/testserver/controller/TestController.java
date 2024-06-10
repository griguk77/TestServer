package com.gukasyan.testserver.controller;

import com.gukasyan.testserver.models.Test;
import com.gukasyan.testserver.service.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestDao testDao;

    @GetMapping("/test/get-all")
    public List<Test> getTests() {
        return testDao.getAllTests();
    }

    @PostMapping("/test/save")
    public void save(@RequestBody Test test) {
        testDao.save(test);
    }

    @DeleteMapping("/test/delete")
    public void delete(@RequestBody Test test) {
        testDao.delete(test);
    }
}
