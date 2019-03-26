package ua.org.crazy.homework02;

import java.math.BigInteger;

public class BigFactorial {

    static BigInteger calculateBigFactorial(int number){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
