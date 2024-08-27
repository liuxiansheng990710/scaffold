package com.example.boot3scaffold.database.mongo;

import java.io.Serial;
import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * mongo基础Model类
 * </p>
 * <p>
 * 需要将ID（用于替换默认的_id）类型传入 默认为Object
 * </P>
 *
 * @author : 21
 * @since : 2024/8/27 10:49
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BaseMongoModel<ID>  implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    protected ID id;

    public ID getId() {
        return id;
    }
}
