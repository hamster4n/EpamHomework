package ua.org.crazy.homework01;

import java.util.Arrays;

public class Main {
    //you have to input number > 2
    private static final int COUNT_FIBONACCI_NUMBER = 5;

    public static void main(String[] args) {

        System.out.println("Sequence Fibonacci for " + COUNT_FIBONACCI_NUMBER);
        System.out.println("Result from method without recursion");
        System.out.println(Arrays.toString(Fibonacci.getFibonacciNumbers(COUNT_FIBONACCI_NUMBER)));
        System.out.println("Fibonacci single number");
        System.out.println(Fibonacci.getFibonacciSingleNumber(COUNT_FIBONACCI_NUMBER));
        System.out.println("Fibonacci single number with recursion: ");
        System.out.println(Fibonacci.getFibonacciSingleNumberWhithRecursion(COUNT_FIBONACCI_NUMBER));

    }
}
