package algorithm.bubble_sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{25, 36, 12, 64, 11, 6};
        BubbleSorter sorter = new BubbleSorter();
        sorter.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
