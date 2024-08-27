package com.example.boot3scaffold.controller;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boot3scaffold.database.mongo.MongoService;
import com.example.boot3scaffold.database.mongo.MongoServiceImpl;
import com.example.boot3scaffold.model.entities.mongo.MongoTest;

@Service
public class MongoTestService extends MongoServiceImpl<MongoTest, Long, MongoTestRepository> implements MongoService<MongoTest, Long> {

    public List<MongoTest> get(String name) {
        return baseRepository.findByNameOrderByUidAsc(name);
    }

}
