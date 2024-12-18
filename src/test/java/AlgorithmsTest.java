import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.example.Algorithms;
import org.junit.jupiter.api.Test;

public class AlgorithmsTest {

    Algorithms algorithms = new Algorithms();

    @Test
    public void testFindMinPositive() {
        int[] array = {3, 5, 2, 7};
        assertEquals(2, algorithms.findMinPositive(array));
    }

    @Test
    public void testFindMinPositive_NoPositives() {
        int[] array = {-1, -2, -3};
        assertThrows(IllegalArgumentException.class, () -> algorithms.findMinPositive(array));
    }

    @Test
    public void testSumNegativeArray() {
        int[] array = {-3, -5, -2};
        assertEquals(-10, algorithms.sumNegativeArray(array));
    }

    @Test
    public void testSumNegativeArray_InvalidInput() {
        int[] array = {-1, 2, -3};
        assertThrows(IllegalArgumentException.class, () -> algorithms.sumNegativeArray(array));
    }

    @Test
    public void testCalculateFibonacci() {
        assertEquals(0, algorithms.calculateFibonacci(0));
        assertEquals(1, algorithms.calculateFibonacci(1));
        assertEquals(55, algorithms.calculateFibonacci(10));
    }

    @Test
    public void testCalculateFibonacci_NegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> algorithms.calculateFibonacci(-1));
    }

    @Test
    public void testCalculateCurrent() {
        assertEquals(2.0, algorithms.calculateCurrent(10, 5), 0.01);
    }

    @Test
    public void testCalculateCurrent_ZeroResistance() {
        assertThrows(IllegalArgumentException.class, () -> algorithms.calculateCurrent(10, 0));
    }
}
