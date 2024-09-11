package com.example.boot3scaffold.log.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * mongo日志类
 * <p>
 *
 * @author : 21
 * @since : 2024/9/9 15:24
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MongoLog extends SuperLog {

    public static final String LOG_PREFIX = "<mongo> - ";

    /**
     * sql
     */
    private String sql;

    /**
     * 集合
     */
    private String collection;

    /**
     * 数据库
     */
    private String dataBase;

    /**
     * sql类型
     */
    private String sqlType;

    /**
     * 是否成功
     */
    private boolean success;

}
