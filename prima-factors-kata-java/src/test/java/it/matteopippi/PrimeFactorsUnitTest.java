package it.matteopippi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorsUnitTest {


    @Test
    void verifyPrimeFactorsTwoIsTwo() {
        PrimeFactor primeFactor = new PrimeFactor();

        List<Integer> factors = primeFactor.find(2);

        assertEquals(1, factors.size());
        assertTrue(factors.contains(2));
    }

    private class PrimeFactor {

        public List<Integer> find(int i) {

                return Arrays.asList(2);

        }
    }
}
