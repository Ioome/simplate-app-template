package com.farm.annotation;

/**
 * @name: ApiVersion
 * @author: sutton
 * @date: 2023-04-26 17:09
 * @description: ApiVersion
 */

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface ApiVersion {
    String value ();
}
