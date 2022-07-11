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

        // display set
        System.out.println("The first set: " + set1);
        System.out.println("The second set: " + set2);

        // the union of two sets
        Set<Integer> union = new HashSet<Integer> (set1); // copy the set1
        union.addAll(set2); // add item of the set 2
        System.out.println("Set union: " + union);

        // intersection of two sets
        Set<Integer> intersection = new HashSet<Integer>(set1); // copy the set1
        intersection.retainAll(set2); //remove those items, those are not present in set2
        System.out.println("Set intersection: " + intersection);

        // the difference of teo sets
        Set<Integer> diff = new HashSet<Integer>(set1); //copy the set1
        diff.removeAll(set2); // remove common elements from two sets
        System.out.println("Set Difference: " + diff);
    }
}
