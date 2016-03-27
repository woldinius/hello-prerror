package de.benwol.test.github.hello_prerror;

/**
 * Created by Ben on 14.03.2016.
 */
public class InsertionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] unsortedInts) {
        insertionSort(unsortedInts);
    }

    public void insertionSort(int[] unsortedInts) {
        int j;
        for (int i = 1; i < unsortedInts.length; i++) {
            int number = unsortedInts[i];
            j = i;
            while (j >= 1 && number < unsortedInts[j - 1]) {
                unsortedInts[j] = unsortedInts[j - 1];
                j -= 1;
            }
            unsortedInts[j] = number;
        }
    }



}

