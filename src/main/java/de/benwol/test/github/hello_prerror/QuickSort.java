package de.benwol.test.github.hello_prerror;

/**
 * Created by Ben on 27.03.2016.
 */
public class QuickSort implements SortingAlgorithm {

    private int[] toBeSorted;

    @Override
    public void sort(int[] unsortedInts) {
        this.toBeSorted = unsortedInts;
        quicksort(0, toBeSorted.length - 1);
    }

    private void quicksort(int left, int right) {
        if (left < right) {
            int divideIndex = divide(left, right);
            quicksort(left, divideIndex - 1);
            quicksort(divideIndex + 1, right);
        }
    }

    private int divide(int left, int right) {
        int i = left;
        int j = right - 1;
        int pivot = toBeSorted[right];

        do {
            while (toBeSorted[i] <= pivot && i < right) {
                i += 1;
            }
            while (toBeSorted[j] >= pivot && j > left) {
                j -= 1;
            }
            if (i < j) {
                exchange(i, j);
            }

        } while (i < j);

        if (toBeSorted[i] > pivot) {
            exchange(i, right);
        }

        return i;
    }

    private void exchange(int i, int j) {
        int old = toBeSorted[i];
        toBeSorted[i] = toBeSorted[j];
        toBeSorted[j] = old;
    }
}
