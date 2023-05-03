package exercises;
public class BinarySearch {
    public static void main(String[] args) {
        // Customise binarySearch() call below to experiment with Binary Search.
        int[] numberList = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(numberList, 7));
    }

    // Accepts ordered list of non-0 numbers and a non-0 number.
    // If number exists in numberList, number is returned. Otherwise, 0 is returned.
    public static int binarySearch(int[] numberList, int number) {
        int lowIndex = 0;
        int highIndex = numberList.length - 1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            int guessedNumber = numberList[midIndex];

            if (guessedNumber < number) {
                lowIndex = midIndex + 1;
            } else if (guessedNumber > number) {
                highIndex = midIndex - 1;
            } else {
                return guessedNumber;
            }
        }
        return 0;
    }
}