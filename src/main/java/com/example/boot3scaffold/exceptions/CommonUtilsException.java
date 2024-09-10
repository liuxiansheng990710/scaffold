package com.example.boot3scaffold.exceptions;

import java.io.Serial;

/**
 * <p>
 * 公用工具类异常
 * <p>
 *
 * @author : 21
 * @since : 2023/9/22 17:53
 */

public class CommonUtilsException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public CommonUtilsException(String message) {
        super(message);
    }

    public CommonUtilsException(Throwable throwable) {
        super(throwable);
    }

    public CommonUtilsException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
