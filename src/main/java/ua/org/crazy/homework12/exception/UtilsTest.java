package ua.org.crazy.homework12.exception;

import ua.org.crazy.homework12.exception.annotation.Ignore;
import ua.org.crazy.homework12.exception.annotation.Test;

public class UtilsTest {

    @Ignore
    @Test()
    public void shouldIgnored(){
        System.out.println("Method1 - should be ignored");
    }

    @Test(expected =  ArithmeticException.class)
    public void shouldThrowException(){
        System.out.println("Method2 - should throw exception");
        throw new ArithmeticException();
    }

    @Test
    public void shouldPrintMessage(){
        System.out.println("Method3 - should print this message");
    }
}
