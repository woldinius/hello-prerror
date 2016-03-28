package de.benwol.test.github.hello_prerror;

import java.util.Random;

/**
 * Created by Ben on 27.03.2016.
 */
class SortAlgorithmsApplication {

    private static SortingAlgorithm get(String identifier) {
        switch (identifier.toLowerCase()) {
            case "quicksort":
                return new QuickSort();
            default:
                return new InsertionSort();
        }

    }


    public static void main(String[] args) {
        String algo = "";
        if (args.length > 0) {
            algo = args[0];
        }
        SortingAlgorithm sorter = get(algo);

        System.out.println("Use algorithm: " + sorter.getClass().getName());

        int[] randomNumbers = new Random().ints(10, 0, 10).toArray();

        for (int i : randomNumbers) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        sorter.sort(randomNumbers);

        for (int i : randomNumbers) {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}
