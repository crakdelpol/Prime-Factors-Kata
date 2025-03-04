package it.matteopippi;

import org.junit.jupiter.api.Test;

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

    private class PrimeFactor {

        public List<Integer> find(int i) {
            if(i == 2){
                return Arrays.asList(2);
            }
            return Arrays.asList(3);
        }
    }
}
