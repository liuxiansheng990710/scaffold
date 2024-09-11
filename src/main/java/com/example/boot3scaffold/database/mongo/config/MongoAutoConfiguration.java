package com.example.boot3scaffold.database.mongo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.boot3scaffold.log.mongo.MongoMetricsFactoryBean;
import com.mongodb.ConnectionString;

@Configuration
@ConditionalOnClass(MongoTemplate.class)
public class MongoAutoConfiguration {

    @Bean
    public MongoCompositeKeyFillCallbck mongoCompositeKeyFillListener() {
        return new MongoCompositeKeyFillCallbck();
    }

    @Bean
    public MongoMetricsFactoryBean mongoLogFactoryBean(MongoProperties properties) {
        MongoMetricsFactoryBean mongoLogFactoryBean = new MongoMetricsFactoryBean();
        mongoLogFactoryBean.setConnectionString(new ConnectionString(properties.getUri()));
        return mongoLogFactoryBean;
    }

}
