package com.example.boot3scaffold.model.entities.mongo;

import java.math.BigInteger;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.boot3scaffold.database.mongo.model.BaseMongoModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Document("mongo_test")
public class MongoTest extends BaseMongoModel<BigInteger> {

    @Indexed
    private Long uid;

    private String name;

}
