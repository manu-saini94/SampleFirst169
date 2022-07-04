package com.bridgelabz.annotations;

import javax.annotation.processing.Generated;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.TYPE})
public @interface MethodInfo {
    String date() default "29-06-2022";
}
