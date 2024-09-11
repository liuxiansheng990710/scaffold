package com.example.boot3scaffold.log.model;

import java.io.Serial;
import java.io.Serializable;

import com.example.boot3scaffold.utils.JacksonUtils;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 日志父类
 * <p>
 *
 * @author : 21
 * @since : 2024/9/9 15:22
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SuperLog implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 日志类型
     */
    private LogEnum type;

    /**
     * 运行环境
     */
    private String environment;

    /**
     * 请求ip
     */
    private String ip;

    /**
     * 运行耗时
     */
    private String runTime;

    @Override
    public String toString() {
        return JacksonUtils.toJson(this);
    }

}

