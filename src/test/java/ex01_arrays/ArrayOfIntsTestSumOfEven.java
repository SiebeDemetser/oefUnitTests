package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsTestSumOfEven {

    @Test
    void sumOfEven_happyflow() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[]{4, 5, 6, 7, 8, 9, 10});

        assertEquals(28, sumOfEven);
    }
    @Test
    void sumOfEven_null_returns0() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(null);

        assertEquals(0, sumOfEven);
    }

    @Test
    void sumOfEven_emptyArray_returns0() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {});

        assertEquals(0, sumOfEven);
    }

    @Test
    void sumOfEven_arrayWithoutEven_returns0() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {3, 5});

        assertEquals(0, sumOfEven);
    }

    @Test
    void sumOfEven_arrayWithOneElement_returnsElement() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOfEven = arrayOfInts.sumOfEven(new int[] {4});

        assertEquals(4, sumOfEven);
    }
}