package de.benwol.test.github.hello_prerror;

import java.util.Random;

/**
 * Created by Ben on 14.03.2016.
 */
public class InsertionSort {

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

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();

        int[] randomNumbers = new Random().ints(10, 0, 10).toArray();

        for (int i : randomNumbers) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        sorter.insertionSort(randomNumbers);

        for (int i : randomNumbers) {
            System.out.print(i);
            System.out.print(" ");
        }

    }

}

