package com.jsj.demo.fruit;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jiangshujing on 2018/2/9.
 * 水果供应者注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitProvider {
    /**
     * 供应商编号
     *
     * @return
     */
    int id() default -1;

    /**
     * 供应商名称
     *
     * @return
     */
    String name() default "";

    /**
     * 供应商地址
     *
     * @return
     */
    String address() default "";
}
