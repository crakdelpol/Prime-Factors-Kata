package it.matteopippi;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsUnitTest {

    PrimeFactor primeFactor = new PrimeFactor();

    @Test
    void verifyPrimeFactorsTwoIsTwo() {
        List<Integer> factors = primeFactor.find(2);

        assertEquals(1, factors.size());
        assertTrue(factors.contains(2));
    }

    @Test
    void verifyPrimeFactorThreeIsThree() {
        List<Integer> factors = primeFactor.find(3);

        assertEquals(1, factors.size());
        assertTrue(factors.contains(3));
    }

    @Test
    void verifyPrimeFourIsTwo() {

        List<Integer> factors = primeFactor.find(4);

        assertEquals(2, factors.size());
        assertTrue(factors.contains(2));
    }

    @Test
    void verifyFactorsSixIsTwoAndThree() {
        List<Integer> primeFactors = primeFactor.find(6);
        assertEquals(2, primeFactors.size());
        assertTrue(primeFactors.contains(2));
        assertTrue(primeFactors.contains(3));
    }

    @Test
    void verifyFactorsOfTwelve() {
        List<Integer> primeFactors = primeFactor.find(12);
        assertEquals(3, primeFactors.size());
        assertTrue(primeFactors.contains(3));
        assertTrue(primeFactors.contains(2));
    }
    @Test
    void verifyFactorsOfFifteen() {
        List<Integer> primeFactors = primeFactor.find(15);
        assertEquals(2, primeFactors.size());
        assertTrue(primeFactors.contains(3));
        assertTrue(primeFactors.contains(5));
    }

    @Test
    void verifyFactorsOfTwentyEight() {
        List<Integer> primeFactors = primeFactor.find(28);
        assertEquals(3, primeFactors.size());
        assertTrue(primeFactors.contains(2));
        assertTrue(primeFactors.contains(7));
    }

    private static class PrimeFactor {

        public List<Integer> find(int i) {
            List<Integer> factors = new ArrayList<Integer>();
            for (int divisor = 2; i > 1; divisor++) {
                while (i % divisor == 0) {
                    factors.add(divisor);
                    i /= divisor;
                }
            }
            return factors;
        }
    }
}
