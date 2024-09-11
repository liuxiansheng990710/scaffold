package com.example.boot3scaffold.log.model;

/**
 * <p>
 * 日志类型枚举类
 * <p>
 *
 * @author : 21
 * @since : 2024/9/9 15:21
 */

public enum LogEnum {

    REQUEST_SUCCESS("request_success", 1, "请求成功日志"),
    REQUEST_FAILED("request_failed", 2, "请求失败日志"),
    MONGO("mongo", 3, "mongodb_SQL日志"),
    MYSQL("mysql", 4, "mysql_SQL日志"),
    RABBIT_MQ("rabbit_mq", 5, "rabbit_mq运行日志"),

    ;

    private final String desc;

    private final Integer type;

    private final String summary;

    LogEnum(String desc, Integer type, String summary) {
        this.desc = desc;
        this.type = type;
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getType() {
        return type;
    }

    public String getSummary() {
        return summary;
    }
}
