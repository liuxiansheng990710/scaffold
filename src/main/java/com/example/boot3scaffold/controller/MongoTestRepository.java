package com.example.boot3scaffold.controller;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.boot3scaffold.model.entities.mongo.MongoTest;

@Repository
public interface MongoTestRepository extends MongoRepository<MongoTest, Long> {

    List<MongoTest> findByNameOrderByUidAsc(String name);

}
