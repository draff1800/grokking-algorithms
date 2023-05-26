package exercises;

public class RecursiveSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(sum(nums));
    }

    public static int sum(int[] nums) {
        int index = 0;
        int sum = 0;

        while(index != nums.length) {
            if (nums == null || nums.length == 0) {
                return 0;
            } else {
                sum = sum + nums[index];
                index++;
            }
        }

        return sum;
    }
}