package ex03_more_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfInts {
    private final Integer[] array1;
    private final Integer[] array2;

    public ArrayOfInts(Integer[] array1, Integer[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[] findCommonElements() {
        if (array1 == null || array2 == null) return new int[]{};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        list1.retainAll(list2);
        int[] array = list1.stream().mapToInt(i -> i).toArray();

        return array;
    }
}
