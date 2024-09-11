package com.example.boot3scaffold.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot3scaffold.model.entities.mongo.MongoTest;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/test")
@RestController
@Slf4j
public class Test {

    @Autowired
    private MongoTestService service;

    @Autowired
    protected MongoTemplate mongoTemplate;

    @GetMapping("/v1")
    public String v1() {
        List<MongoTest> mongoTests = service.get("21");
        MongoTest mongoTest = new MongoTest();
        mongoTest.setName("666");
        mongoTest.setUid(333L);
        mongoTest.setId(666L);
//        service.save(mongoTest);
        MongoTest mongoTest2 = new MongoTest();
        mongoTest2.setId(777L);
        mongoTest2.setUid(777L);
        mongoTest2.setName("21");
        List<MongoTest> objects = new ArrayList<>();
        objects.add(mongoTest);
        objects.add(mongoTest2);
        service.saveAll(objects);
        return mongoTests.toString();
    }

}
