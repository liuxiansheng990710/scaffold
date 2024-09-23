package com.example.boot3scaffold.config.web.undertow;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.undertow.Undertow;

/**
 * <p>
 * web自动配置类
 * </p>
 *
 * @author : 21
 * @since : 2024/9/20 11:43
 */

@ConditionalOnWebApplication
@Configuration
public class WebAutoConfiguration {

    /**
     * web undertow配置
     *
     * @return
     */
    @Bean
    @ConditionalOnClass(Undertow.class)
    public UndertowServerFactoryCustomizer undertowServerFactoryCustomizer() {
        return new UndertowServerFactoryCustomizer();
    }

}
