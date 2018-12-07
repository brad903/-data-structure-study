package sort;

import java.util.*;
import java.util.stream.IntStream;

public class Sort {

    // insert sort
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) swap(arr, j, j + 1);
                else break;
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
