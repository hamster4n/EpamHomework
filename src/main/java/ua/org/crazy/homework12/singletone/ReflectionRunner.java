package ua.org.crazy.homework12.singletone;

import java.lang.reflect.Constructor;

public class ReflectionRunner {
    public static void main(String[] args) throws Exception {
        Constructor<Singletone> constructor = Singletone.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        Singletone instance1 = constructor.newInstance();
        Singletone instance2 = constructor.newInstance();

        System.out.println("first instance == second instance  -->>" + (instance1 == instance2));
    }

}
