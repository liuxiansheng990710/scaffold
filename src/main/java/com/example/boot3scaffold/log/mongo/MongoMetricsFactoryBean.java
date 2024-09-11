package com.example.boot3scaffold.log.mongo;

import org.springframework.data.mongodb.core.MongoClientFactoryBean;

import com.mongodb.MongoClientSettings;

/**
 * <p>
 * mongo指标工厂，主要是注册mongo指标监听器
 * <p>
 *
 * @author : 21
 * @since : 2024/9/10 15:08
 */

public class MongoMetricsFactoryBean extends MongoClientFactoryBean {

    @Override
    protected MongoClientSettings computeClientSetting() {
        return MongoClientSettings
                .builder(super.computeClientSetting())
                .addCommandListener(new MongoMetricsListener())
                .build();
    }
}
