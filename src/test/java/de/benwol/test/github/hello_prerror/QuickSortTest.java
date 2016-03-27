package de.benwol.test.github.hello_prerror;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ben on 14.03.2016.
 */
public class QuickSortTest {

    @Test
    public void test_insertionSort_with_100_random_ints() {
        int[] arrayOf100ints = new Random().ints(100).toArray();
        InsertionSort sorter = new InsertionSort();
        sorter.insertionSort(arrayOf100ints);

        boolean sorted = true;
        for (int i = 1; i < arrayOf100ints.length && sorted; i++) {
            sorted = arrayOf100ints[i - 1] <= arrayOf100ints[i];
        }

        assertTrue("Array is not sorted", sorted);
    }
}
