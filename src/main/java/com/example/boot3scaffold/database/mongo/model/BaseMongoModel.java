package com.example.boot3scaffold.database.mongo.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

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
public class BaseMongoModel<ID> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 自定义id，如果使用此id，则保存方法会视为update类型
     * 且与自定义创建时间冲突O
     */
    @Id
    protected ID id;

    public ID getId() {
        return id;
    }

    /**
     * 创建人
     * 注意：这里如果使用自定义id的话，会导致创建人失效
     */
    @CreatedBy
    public String createBy;

    /**
     * 修改人
     */
    @LastModifiedBy
    public String updateBy;

    /**
     * 创建时间
     * 注意：这里如果使用自定义id的话，会导致创建时间失效
     */
    @CreatedDate
    public Date createTime;

    /**
     * 修改时间
     */
    @LastModifiedDate
    public Date updateTime;
}
