package Udemy_tasks.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class personClass2 = person.getClass();
        Class personClass = Person.class;
        Class personClass3 = Class.forName("Udemy_tasks.reflection.Person");

        Method [] methods = personClass.getMethods();
        for(Method method: methods){
            System.out.println(method.getName() + ", "
                    + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
        }

        Field[] fields = personClass.getDeclaredFields();
        for(Field field: fields){
            System.out.println(field.getName() + ", "
                    + field.getType());
        }
        Annotation[] annotation = personClass.getAnnotations();
        for(Annotation annotation1: annotation){
            if(annotation1 instanceof Author){
                System.out.println("YES");
            }
        }
    }
}
