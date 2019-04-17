package ua.org.crazy.homework12.exception;

import ua.org.crazy.homework12.exception.annotation.Ignore;
import ua.org.crazy.homework12.exception.annotation.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EJUnitRunner {
    public static void main(String[] args) throws Exception {
        Class<UtilsTest> testClazz = UtilsTest.class;

        Constructor<UtilsTest> constructor = testClazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        UtilsTest instance = constructor.newInstance();

        Method[] methods = testClazz.getDeclaredMethods();

        List<Method> testMethods = Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(Test.class))
                .filter(method -> !method.isAnnotationPresent(Ignore.class))
                .collect(Collectors.toList());

        for (Method method: testMethods) {
            runSingleMethod(instance, method);
        }
    }

    private static void runSingleMethod(UtilsTest instance, Method method) {
        String methodName = method.getName();
        Class<? extends Throwable> expected = method.getDeclaredAnnotation(Test.class).expected();
        try {
            method.invoke(instance);
        } catch (Exception e){
            if (expected.equals(e.getCause().getClass())){
                System.out.println("Method " + methodName + " work good!");
            }
        }
    }
}
