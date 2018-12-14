package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class SortTest {

    Sort sort;
    final int size = 10;

    @Before
    public void setUp() throws Exception {
        sort = new Sort();
    }

//    @Test
//    public void genArray() {
//        int[] array = sort.genArray(5);
//        assertThat(array[4]).isEqualTo(4);
//    }
//
//    @Test(expected = ArrayIndexOutOfBoundsException.class)
//    public void genArray_범위넘을때() {
//        int[] array = sort.genArray(5);
//        assertThat(array[5]).isEqualTo(5);
//    }
//
//    @Test
//    public void shuffle() {
//        int[] array = sort.genArray(5);
//        int origin = array[0];
//        sort.shuffle(array);
//        int after = array[0];
//        assertThat(origin == after).isEqualTo(false);
//    }
//
//    @Test
//    public void insertSort() {
//        int[] array = sort.genArray(20);
//        sort.shuffle(array);
//        sort.printArray(array);
//        sort.insertionSort(array);
//        sort.printArray(array);
//    }
//
//    @Test
//    public void bubbleSort() {
//        int[] array = sort.genArray(20);
//        sort.shuffle(array);
//        sort.printArray(array);
//        sort.bubbleSort(array);
//        sort.printArray(array);
//    }

    @Test
    public void buble_insertion() {
        int[] array = sort.genArray(50000);
        sort.shuffle(array);
        long start = System.currentTimeMillis();
        sort.bubbleSort(array);
        long middle = System.currentTimeMillis();
        System.out.println("bubbleFirst : " + (middle - start));
        sort.insertionSort(array);
        long end = System.currentTimeMillis();
        System.out.println("insertionLast : " + (end - middle));
        System.out.println("-----------------------------------");
    }

    @Test
    public void insertion_bubble() {
        int[] array = sort.genArray(50000);
        sort.shuffle(array);
        long start = System.currentTimeMillis();
        sort.insertionSort(array);
        long middle = System.currentTimeMillis();
        System.out.println("insertionFirst : " + (middle - start));
        sort.bubbleSort(array);
        long end = System.currentTimeMillis();
        System.out.println("bubbleLast : " + (end - middle));
        System.out.println("-----------------------------------");
    }

    @Test
    public void insertion_insertion() {
        int[] array = sort.genArray(50000);
        sort.shuffle(array);
        long start = System.currentTimeMillis();
        sort.insertionSort(array);
        long middle = System.currentTimeMillis();
        System.out.println("insertionFirst : " + (middle - start));
        sort.insertionSort(array);
        long end = System.currentTimeMillis();
        System.out.println("insertionTwice : " + (end - middle));
        System.out.println("-----------------------------------");
    }

    @Test
    public void bubble_bubble() {
        int[] array = sort.genArray(50000);
        sort.shuffle(array);
        long start = System.currentTimeMillis();
        sort.bubbleSort(array);
        long middle = System.currentTimeMillis();
        System.out.println("bubbleFirst : " + (middle - start));
        sort.bubbleSort(array);
        long end = System.currentTimeMillis();
        System.out.println("bubbleTwice : " + (end - middle));
        System.out.println("-----------------------------------");
    }

    @Test
    public void array_sort() {
        int[] array = sort.genArray(50000);
        sort.shuffle(array);
        long start = System.currentTimeMillis();
        Arrays.sort(array);
        long middle = System.currentTimeMillis();
        System.out.println("arraySortFirst : " + (middle - start));
        Arrays.sort(array);
        long end = System.currentTimeMillis();
        System.out.println("arraySortTwice : " + (end - middle));
        System.out.println("-----------------------------------");
    }
}