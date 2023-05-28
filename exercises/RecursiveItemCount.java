package exercises;

import java.util.Arrays;

public class RecursiveItemCount {
    public static void main(String[] args) {
        // Customise "items" array to output different counts
        int[] items = {1,2,3,4,5};
        System.out.println(itemCount(items));
    }

    // Accepts an array of ints, and calculates the number of elements via recursion
    public static int itemCount(int[] items) {
        int runningCount = 0;

        if (items == null || items.length == 0) {
            return runningCount;
        } else if (items.length == 1) {
            return 1;
        } else {
            runningCount = 1 + itemCount(Arrays.copyOfRange(items, 1, items.length));
            return runningCount;
        }
    }
}