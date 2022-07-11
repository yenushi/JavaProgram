package hash;

import java.util.*;

public class javaset {
    public static void main(String[] args) {
        int[] list1 = {1, 5, 2, 6, 5, 2, 12}; // some duplicate data are presented
        int[] list2 = {12, 4, 3, 2, 4, 15};

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        // add item in two different sets
        for(int item: list1)
            set1.add(item);
        for(int item: list2)
            set2.add(item);
    }
}
