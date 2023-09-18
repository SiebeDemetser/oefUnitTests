package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsTest {

    @Test
    void sumOf3SmallestInts_happyflow() {
        ArrayOfInts arrayOfInts = new ArrayOfInts();
        int sumOf3SmallestInts = arrayOfInts.sumOf3SmallestInts(new int[]{1, 2, 3, 4});

        assertEquals(6, sumOf3SmallestInts);
    }
}