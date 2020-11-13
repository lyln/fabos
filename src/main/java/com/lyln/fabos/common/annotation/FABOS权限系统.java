package com.lyln.fabos.common.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.meta.TypeQualifierNickname;
import java.lang.annotation.*;

/**
 * @author MrBird
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
@TypeQualifierNickname
@SuppressWarnings("all")
@EnableAsync
@EnableTransactionManagement
public @interface FABOS权限系统 {
}
