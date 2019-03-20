package ua.org.crazy.homework01;

class Fibonacci {
    static int[] getFibonacciNumbers(int number) {
        int fib0 = 1;
        int fib1 = 1;
        int temp;
        int[] result = new int[number];
        result[0] = fib0;
        result[1] = fib1;
        for (int i = 2; i < number; i++) {
            temp = fib0 + fib1;
            result[i] = temp;
            fib0 = fib1;
            fib1 = temp;
        }
        return result;
    }


    static int getFibonacciSingleNumber(int number){
        int fib0 = 1;
        int fib1 = 1;
        int temp = 0;
        for (int i = 2; i < number; i++) {
            temp = fib0 + fib1;
            fib0 = fib1;
            fib1 = temp;
        }
        return temp;
    }

    static int getFibonacciSingleNumberWhithRecursion(int number) {
        if (number ==0){return 0;}
        if (number == 1) {return 1;}
        return getFibonacciSingleNumberWhithRecursion(number - 1) + getFibonacciSingleNumberWhithRecursion(number - 2);
    }
}
