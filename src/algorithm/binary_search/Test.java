package algorithm.binary_search;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{12, 20, 26, 36, 41, 53, 120};
        Integer key = 53;
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Integer.valueOf(o1) < Integer.valueOf(o2)){
                    return -1;
                } else if (Integer.valueOf(o1) > Integer.valueOf(o2)){
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        int i = MyUtil.binarySearch(arr, key, comparator);
//        int i = MyUtil.binarySearch(arr, key);
        System.out.println(i);
    }
}
