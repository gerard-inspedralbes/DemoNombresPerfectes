package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @BeforeEach
    void setUp() {
        System.out.println("Iniciem testing");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalitzem testing");
    }

    @Test
    void testGetDivisors50() {
        ArrayList<Integer> alExpected = new ArrayList<>(Arrays.asList(1,2,5,10,25));
        ArrayList<Integer> alResult = Utils.getDivisors(50);
        assertEquals(alExpected,alResult);
    }

    @Test
    void testGetDivisorsNotNull() {
        ArrayList<Integer> alResult = Utils.getDivisors(1);
        assertNotNull(alResult);
    }

}