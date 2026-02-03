package basics;

import java.util.HashSet;
import java.util.Set;

public class commonElem {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 55, 66, 77, 99, 88, 0};
        int arr2[] = {12, 13, 14, 55, 88, 99, 18, 19, 5};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int value : arr) {
            seen.add(value);
        }
        for (int value : arr2) {
            if (seen.contains(value)) {
                common.add(value);
            }
        }

        for (int value : common) {
            System.out.println(value);
        }
    }
}
