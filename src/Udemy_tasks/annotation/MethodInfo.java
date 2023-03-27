package Udemy_tasks.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})//можем использовать только для метода
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "MeDan";
    int dateOfCreation() default 2019;
    String purpose();
}
