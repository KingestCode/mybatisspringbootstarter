package com.test;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Import(GirlFriendConfigration.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableSelfConfig {
}
