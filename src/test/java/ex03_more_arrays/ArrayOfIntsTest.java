package ex03_more_arrays;

import ex02.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsTest {

    @Test
    void productDescription_happyflow() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{1, 2, 3}, new Integer[]{2, 3, 4});
        assertArrayEquals(new int[]{2, 3}, arrayOfInts.findCommonElements());
    }
    @Test
    void productDescription_outOfOrder() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{1, 2, 3}, new Integer[]{4, 5, 1});
        assertArrayEquals(new int[]{1}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_dubbels() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{1, 2, 3}, new Integer[]{2,2,3});
        assertArrayEquals(new int[]{2,3}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_differentSize() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{1, 2, 3}, new Integer[]{2,3,4,5,6});
        assertArrayEquals(new int[]{2,3}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_NoCommonElements_EmptyList() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{1, 2, 3}, new Integer[]{4, 5, 6});
        assertArrayEquals(new int[]{}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_firstListEmpty_EmptyList() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{}, new Integer[]{4, 5, 6});
        assertArrayEquals(new int[]{}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_secondListEmpty_EmptyList() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{1, 2, 3}, new Integer[]{});
        assertArrayEquals(new int[]{}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_firstListNull_EmptyList() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(null, new Integer[]{4, 5, 6});
        assertArrayEquals(new int[]{}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_secondListNull_EmptyList() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{1, 2, 3}, null);
        assertArrayEquals(new int[]{}, arrayOfInts.findCommonElements());
    }

    @Test
    void productDescription_bothListEmpty_EmptyList() {
        ArrayOfInts arrayOfInts = new ArrayOfInts(new Integer[]{}, new Integer[]{});
        assertArrayEquals(new int[]{}, arrayOfInts.findCommonElements());
    }
}