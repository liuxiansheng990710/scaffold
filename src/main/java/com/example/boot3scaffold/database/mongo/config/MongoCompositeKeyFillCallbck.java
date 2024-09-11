package com.example.boot3scaffold.database.mongo.config;

import java.util.Objects;

import org.springframework.core.Ordered;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;

import com.example.boot3scaffold.database.mongo.model.BaseMongoModel;

public class MongoCompositeKeyFillCallbck implements BeforeConvertCallback<BaseMongoModel>, Ordered {

    /**
     * 为了让框架已有方法优先执行，
     * 否则先填充id会出现审计字段无法填充的情况，
     * 因为@CreatedDate被执行的条件是id为空
     *
     * @return
     */
    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

    @Override
    public BaseMongoModel onBeforeConvert(BaseMongoModel entity, String collection) {
        if (Objects.isNull(entity.getId())) {
            entity.setId(entity.getId());
        }
        return entity;
    }
}
