package sort;


import java.util.Scanner;

public class MergeSortDriver {
    public static void main(String[] args) {
        MergeSort<Integer> mergeSort = new MergeSort<Integer>();
        Scanner jin = new Scanner(System.in);
        int t;
        int n;
        Integer[] keys;

        t = jin.nextInt();
        while (t-- > 0) {
            n = jin.nextInt();
            keys = new Integer[n];
            for (int i = 0; i < n; ++i) {
                keys[i] = jin.nextInt();
            }

            System.out.println("The initial unsorted array is:");
            for (int i = 0; i < n; ++i) {
                System.out.printf("%5d", keys[i]);
                if (i % 10 == 9) {
                    System.out.println();
                }
            }

            mergeSort.sort(keys);

            System.out.println("The final sorted array is:");
            for (int i = 0; i < n; ++i) {
                System.out.printf("%5d", keys[i]);
                if (i % 10 == 9) {
                    System.out.println();
                }
            }

            System.out.println("The counter value is "
                    + mergeSort.getCounter() + ".");
            System.out.println();
        }
    }
}
