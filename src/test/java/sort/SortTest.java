package sort;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public class SortTest {
    private static final Logger log = getLogger(SortTest.class);

    Sort sort;
    final int size = 10;

    @Before
    public void setUp() throws Exception {
        sort = new Sort();
    }

    @Test
    public void genArray() {
        int[] array = sort.genArray(5);
        assertThat(array[4]).isEqualTo(4);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void genArray_범위넘을때() {
        int[] array = sort.genArray(5);
        assertThat(array[5]).isEqualTo(5);
    }

    @Test
    public void shuffle() {
        int[] array = sort.genArray(5);
        int origin = array[0];
        sort.shuffle(array);
        int after = array[0];
        assertThat(origin == after).isEqualTo(false);
    }

    @Test
    public void sort() {
        int[] array = sort.genArray(20);
        sort.shuffle(array);
        sort.printArray(array);
        sort.sort(array);
        sort.printArray(array);
    }
}