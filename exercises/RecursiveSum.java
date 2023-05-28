package exercises;

import java.util.Arrays;

public class RecursiveSum {
    public static void main(String[] args) {
        // Customise "nums" array to output different totals
        int[] nums = {1,2,3,4,5};
        System.out.println(sum(nums));
    }

    // Accepts an array of ints, and calculates their total using recursion
    public static int sum(int[] nums) {
        int runningTotal = 0;

        if (nums == null || nums.length == 0) {
            return runningTotal;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            runningTotal = nums[0] + sum(Arrays.copyOfRange(nums, 1, nums.length));
            return runningTotal;
        }
    }
}