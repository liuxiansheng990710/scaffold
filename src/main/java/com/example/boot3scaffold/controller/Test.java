package com.example.boot3scaffold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot3scaffold.model.entities.mongo.MongoTest;

@RequestMapping("/test")
@RestController
public class Test {

    @Autowired
    private MongoTestService service;

    @GetMapping("/v1")
    public String v1() {
        List<MongoTest> mongoTests = service.get("21");
        return mongoTests.toString();
    }

}
