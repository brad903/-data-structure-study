package sort;

import java.util.*;
import java.util.stream.IntStream;

public class Sort {

    // insert insertionSort
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public void shuffle(int[] arr) {
        Random random = new Random();

        // knuth shuffle
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            swap(arr, i, random.nextInt(i + 1));
        }
    }

    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void swap(int[] arr, int i, int randomPosition) {
        int temp = arr[randomPosition];
        arr[randomPosition] = arr[i];
        arr[i] = temp;
    }

    public int[] genArray(int size) {
        return IntStream.range(0, size).toArray();
    }
}
