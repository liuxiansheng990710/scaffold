package com.example.boot3scaffold.database.mongo.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

import lombok.NonNull;

/**
 * <p>
 * mongo操作人信息自动配置，主要针对于LastModifiedBy和createBy
 * {@link  com.example.boot3scaffold.database.mongo.model.BaseMongoModel}
 * <p>
 *
 * @author : 21
 * @since : 2024/9/12 11:17
 */

public class MongoOperatorAuditorAware implements AuditorAware<String> {

    @Override
    @NonNull
    public Optional<String> getCurrentAuditor() {
        return Optional.of("21");
    }
}
