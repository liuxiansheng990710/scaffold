package com.example.boot3scaffold.database.mongo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.boot3scaffold.log.mongo.MongoMetricsFactoryBean;
import com.mongodb.ConnectionString;

/**
 * <p>
 * mongo自动配置类
 * <p>
 *
 * @author : 21
 * @since : 2024/9/12 11:16
 */

@Configuration
@ConditionalOnClass(MongoTemplate.class)
public class MongoAutoConfiguration {

    /**
     * mongo id配置替换
     *
     * @return
     */
    @Bean
    public MongoCompositeKeyFillCallbck mongoCompositeKeyFillListener() {
        return new MongoCompositeKeyFillCallbck();
    }

    /**
     * mongo 日志工厂
     *
     * @param properties
     * @return
     */
    @Bean
    public MongoMetricsFactoryBean mongoLogFactoryBean(MongoProperties properties) {
        MongoMetricsFactoryBean mongoLogFactoryBean = new MongoMetricsFactoryBean();
        mongoLogFactoryBean.setConnectionString(new ConnectionString(properties.getUri()));
        return mongoLogFactoryBean;
    }

    /**
     * mongo 操作人信息自动填充
     *
     * @return
     */
    @Bean
    public MongoOperatorAuditorAware operatorAuditorAware() {
        return new MongoOperatorAuditorAware();
    }

}
