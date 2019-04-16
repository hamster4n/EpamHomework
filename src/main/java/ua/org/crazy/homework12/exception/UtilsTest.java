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
        throw new ArithmeticException();
//        System.out.println("Method2 - should thow exception");
    }

    @Test
    public void shouldPrintMessage(){
        System.out.println("Method3 - should print this message");
    }
}